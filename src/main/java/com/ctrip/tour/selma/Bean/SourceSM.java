package com.ctrip.tour.selma.Bean;

import java.sql.Timestamp;

/**
 * Created by zhang_jf on 2017/8/1.
 */
public class SourceSM {
    private int age;
    private AddressSM addressSM;
    private Timestamp timestamp;

    public SourceSM() {
    }

    public SourceSM(int age,AddressSM addressSM,Timestamp timestamp) {
        this.age = age;
        this.addressSM  = addressSM ;
        this.timestamp = timestamp;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AddressSM getAddressSM() {
        return addressSM;
    }

    public void setAddressSM(AddressSM addressSM) {
        this.addressSM = addressSM;
    }
}
