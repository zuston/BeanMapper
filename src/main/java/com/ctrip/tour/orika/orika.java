package com.ctrip.tour.orika;

import com.ctrip.tour.MapperObject.SourceBean;
import com.ctrip.tour.MapperObject.TargetBean;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.ArrayList;
import java.util.Arrays;

import static com.ctrip.tour.dozer.dozer.generateDepartmentBean;

/**
 * Created by zhang_jf on 2017/8/4.
 */
public class orika {
    public static void main(String[] args) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(SourceBean.class, TargetBean.class)
                .byDefault()
                .register();
        MapperFacade mapperFacade = mapperFactory.getMapperFacade();
        long startTime = System.currentTimeMillis();
        for (int i=0;i<1;i++){
            SourceBean sourceBean = new SourceBean(
                    9,
                    "Ctrip",
                    new ArrayList<String>(Arrays.asList("Vnedor","Ship","Hotel")),
                    generateDepartmentBean()
            );

            TargetBean targetBean = mapperFacade.map(sourceBean, TargetBean.class);
            targetBean.getDepartmentHashMap().get("Vendor").getPersonList().get(0).setPersonAge(100);
            System.out.println(sourceBean.getDepartmentHashMap().get("Vendor").getPersonList().get(0).getPersonAge());
            targetBean = null;
        }
        long endTime = System.currentTimeMillis();

        System.out.println("orika costTime : "+(endTime - startTime));
    }
}
