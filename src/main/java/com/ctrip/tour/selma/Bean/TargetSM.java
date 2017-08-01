package com.ctrip.tour.selma.Bean;

import java.util.Calendar;

/**
 * Created by zhang_jf on 2017/8/1.
 */
public class TargetSM {
    private Integer age ;
    private String addressName;
    private Integer addressNo;
    private Calendar calendar;



    public TargetSM(Integer age, String addressName, Integer addressNo,Calendar calendar) {
        this.age = age;
        this.addressName = addressName;
        this.addressNo = addressNo;
        this.calendar = calendar;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public TargetSM() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Integer getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(Integer addressNo) {
        this.addressNo = addressNo;
    }
}
