package com.ctrip.tour.dozer;

import com.ctrip.tour.MapperObject.*;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by zhang_jf on 2017/7/20.
 */

/**
 * 基于运行时反射实现，较耗费资源
 */
public class dozer {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Mapper mapper = new DozerBeanMapper();

        SourceBean sourceBean = new SourceBean(
                9,
                "Ctrip",
                new ArrayList<String>(Arrays.asList("Vnedor","Ship","Hotel")),
                generateDepartmentBean()
        );

        TargetBean targetBean = mapper.map(sourceBean,TargetBean.class);
        System.out.println(targetBean.getHeadCount());
        System.out.println(targetBean.getCompanyName());
        System.out.println(targetBean.getDepartmentName());
        System.out.println(targetBean.getDepartmentHashMap());

        long endTime = System.currentTimeMillis();
        System.out.println("costTime : "+ (endTime-startTime));
    }



    public static ArrayList<PersonBean> generatePersonBean(){
        PersonBean personBeanA = new PersonBean("A",24,"master");
        PersonBean personBeanB = new PersonBean("B",25,"master");
        PersonBean personBeanC = new PersonBean("C",25,"master");

        return new ArrayList<PersonBean>(Arrays.asList(personBeanA,personBeanB,personBeanC));
    }

    public static HashMap<String,DepartmentBean> generateDepartmentBean(){
        DepartmentBean departmentBeanA = new DepartmentBean(
                "Vendor",
                3,
                generatePersonBean()
        );

        DepartmentBean departmentBeanB = new DepartmentBean(
            "Ship",
                3,
                generatePersonBean()
        );

        DepartmentBean departmentBeanC = new DepartmentBean(
                "Hotel",
                3,
                generatePersonBean()
        );

        HashMap<String,DepartmentBean> hm = new HashMap<String, DepartmentBean>();
        hm.put("Vendor",departmentBeanA);
        hm.put("Ship",departmentBeanB);
        hm.put("Hotel",departmentBeanC);
        return hm;
    }
}
