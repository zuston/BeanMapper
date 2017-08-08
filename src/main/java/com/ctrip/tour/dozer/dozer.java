package com.ctrip.tour.dozer;

import com.ctrip.tour.MapperObject.*;
import com.ctrip.tour.MapperObject.SourceBean;
import com.ctrip.tour.MapperObject.TargetBean;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.modelmapper.ModelMapper;

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
//        Mapper mapper = new DozerBeanMapper();
//        long startTime = System.currentTimeMillis();
//        for (int i =0 ;i<1;i++){
//
//            SourceBean sourceBean = new SourceBean(
//                    19,
//                    "PCtrip",
//                    new ArrayList<String>(Arrays.asList("PVnedor","PShip","PHotel")),
//                    generateDepartmentBean()
//            );
//
//            TargetBean targetBean = mapper.map(sourceBean,TargetBean.class);
//            // 测试是否深复制
//            targetBean.getDepartmentHashMap().get("Vendor").getPersonList().get(0).setPersonAge(100);
//            System.out.println(sourceBean.getDepartmentHashMap().get("Vendor").getPersonList().get(0).getPersonAge());
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("costTime : "+ (endTime-startTime));


        /**
         * modelmapper framework
         * gc 性能
         */
        ModelMapper modelMapper = new ModelMapper();
        long startTime = System.currentTimeMillis();
        for (int i=0;i<1;i++){
            SourceBean sourceBean1 = new SourceBean(
                    9,
                    "Ctrip",
                    new ArrayList<String>(Arrays.asList("Vnedor","Ship","Hotel")),
                    generateDepartmentBean()
            );
            TargetBean targetBean1 = modelMapper.map(sourceBean1,TargetBean.class);
            targetBean1.getDepartmentHashMap().get("Vendor").getPersonList().get(0).setPersonAge(100);
            System.out.println(sourceBean1.getDepartmentHashMap().get("Vendor").getPersonList().get(0).getPersonAge());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("threeLayer modelMapper costTime : "+(endTime-startTime));
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
