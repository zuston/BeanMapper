package com.ctrip.tour.selma.Bean;

/**
 * Created by zhang_jf on 2017/8/1.
 */
public class AddressSM {
    private String addressName;
    private Integer addressNo;

    public AddressSM(String addressName, Integer addressNo) {
        this.addressName = addressName;
        this.addressNo = addressNo;
    }

    public AddressSM() {
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
