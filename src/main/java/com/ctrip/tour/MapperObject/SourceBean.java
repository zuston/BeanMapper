package com.ctrip.tour.MapperObject;

import org.dozer.Mapping;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by zhang_jf on 2017/7/31.
 */
public class SourceBean {
    private Integer headCount;
    private String companyName;
    private ArrayList<String> departmentName;
    private HashMap<String,DepartmentBean> departmentHashMap;

    public SourceBean(Integer headCount, String companyName, ArrayList<String> departmentName, HashMap<String, DepartmentBean> departmentHashMap) {
        this.headCount = headCount;
        this.companyName = companyName;
        this.departmentName = departmentName;
        this.departmentHashMap = departmentHashMap;
    }

    public SourceBean() {
    }

    public Integer getHeadCount() {
        return headCount;
    }

    public void setHeadCount(Integer headCount) {
        this.headCount = headCount;
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

    public HashMap<String, DepartmentBean> getDepartmentHashMap() {
        return departmentHashMap;
    }

    public void setDepartmentHashMap(HashMap<String, DepartmentBean> departmentHashMap) {
        this.departmentHashMap = departmentHashMap;
    }
}
