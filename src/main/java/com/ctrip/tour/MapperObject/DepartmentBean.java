package com.ctrip.tour.MapperObject;

import java.util.ArrayList;

/**
 * Created by zhang_jf on 2017/7/31.
 */
public class DepartmentBean {
    private String departmentName;
    private Integer departmentHeadCount;
    private ArrayList<PersonBean> personList;

    public DepartmentBean(String departmentName, Integer departmentHeadCount, ArrayList<PersonBean> personList) {
        this.departmentName = departmentName;
        this.departmentHeadCount = departmentHeadCount;
        this.personList = personList;
    }

    public DepartmentBean() {
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getDepartmentHeadCount() {
        return departmentHeadCount;
    }

    public void setDepartmentHeadCount(Integer departmentHeadCount) {
        this.departmentHeadCount = departmentHeadCount;
    }

    public ArrayList<PersonBean> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<PersonBean> personList) {
        this.personList = personList;
    }
}
