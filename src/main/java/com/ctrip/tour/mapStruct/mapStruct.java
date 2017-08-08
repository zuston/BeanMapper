package com.ctrip.tour.mapStruct;

import com.ctrip.tour.MapperObject.SourceBean;
import com.ctrip.tour.MapperObject.TargetBean;
import com.ctrip.tour.mapStruct.Bean.SourceMS;
import com.ctrip.tour.mapStruct.Bean.TargetMS;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import static com.ctrip.tour.dozer.dozer.generateDepartmentBean;

/**
 * Created by zhang_jf on 2017/7/31.
 */
public class mapStruct {
    public static void main(String[] args) {
        // 类加载器加载类耗时较大
        BeanMapper sm = BeanMapper.BEAN_MAPPER;
        long startTime = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            SourceBean sourceBean = new SourceBean(
                    9,
                    "Ctrip",
                    new ArrayList<String>(Arrays.asList("Vnedor","Ship","Hotel")),
                    generateDepartmentBean()
            );
            TargetBean targetBean = sm.convert(sourceBean);
//            targetBean.getDepartmentHashMap().get("Vendor").getPersonList().get(0).setPersonAge(100);
//            System.out.println(sourceBean.getDepartmentHashMap().get("Vendor").getPersonList().get(0).getPersonAge());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("costTime : "+ (endTime-startTime));

//        System.out.println(BeanMapper.BEAN_MAPPER.priceBigDecimal(Arrays.asList(10)));
//
//        SourceMS sourceMS = new SourceMS(new Timestamp(System.currentTimeMillis()),new Date(0L), Calendar.getInstance());
//
//        TargetMS targetMS = BeanMapper.BEAN_MAPPER.timeConvert(sourceMS);
//
//        System.out.println(targetMS.getTimestamp().getTime());
//
//        System.out.println(targetMS.getCalendar());
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DATE,2);
//
//        System.out.println(calendar.getTime());

    }
}
