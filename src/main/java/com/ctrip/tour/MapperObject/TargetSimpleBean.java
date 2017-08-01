package com.ctrip.tour.MapperObject;

import java.util.ArrayList;

/**
 * Created by zhang_jf on 2017/7/31.
 */
public class TargetSimpleBean {
    private Integer companyCount;
    private String companyName;
    private ArrayList<String> departmentName;

    public TargetSimpleBean(Integer companyCount, String companyName, ArrayList<String> departmentName) {
        this.companyCount = companyCount;
        this.companyName = companyName;
        this.departmentName = departmentName;
    }

    public TargetSimpleBean() {
    }

    public Integer getCompanyCount() {
        return companyCount;
    }

    public void setCompanyCount(Integer companyCount) {
        this.companyCount = companyCount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<String> getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(ArrayList<String> departmentName) {
        this.departmentName = departmentName;
    }
}
