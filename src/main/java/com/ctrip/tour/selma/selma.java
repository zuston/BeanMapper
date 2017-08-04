package com.ctrip.tour.selma;

import com.ctrip.tour.MapperObject.SourceBean;
import com.ctrip.tour.MapperObject.TargetBean;
import com.ctrip.tour.selma.Bean.AddressSM;
import com.ctrip.tour.selma.Bean.SourceSM;
import com.ctrip.tour.selma.Bean.TargetSM;
import fr.xebia.extras.selma.Selma;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;

import static com.ctrip.tour.dozer.dozer.generateDepartmentBean;

/**
 * Created by zhang_jf on 2017/7/31.
 */
public class selma {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            SelmaMapper selmaMapper = Selma.builder(SelmaMapper.class).build();
            SourceBean sourceBean = new SourceBean(
                    9,
                    "Ctrip",
                    new ArrayList<String>(Arrays.asList("Vnedor","Ship","Hotel")),
                    generateDepartmentBean()
            );
            TargetBean targetBean = selmaMapper.convert(sourceBean);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("costTime : "+ (endTime-startTime));


//        AddressSM addressSM = new AddressSM("jiangsu",200);
//        SourceSM sourceSM = new SourceSM(10,addressSM,new Timestamp(System.currentTimeMillis()));
//        TargetSM targetSM = selmaMapper.convertT(sourceSM);
//        System.out.println(targetSM.getCalendar().getTime());
    }
}
