package com.ctrip.tour.selma;

import com.ctrip.tour.MapperObject.SourceBean;
import com.ctrip.tour.MapperObject.TargetBean;
import com.ctrip.tour.selma.Bean.SourceSM;
import com.ctrip.tour.selma.Bean.TargetSM;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;
import jdk.nashorn.internal.ir.WithNode;

import java.sql.Timestamp;
import java.util.Calendar;

/**
 * Created by zhang_jf on 2017/7/31.
 */

/**
 * 支持循环引用
 * 支持类似于数据库左链接，右链接的操作
 * 扁平化 映射 flatten bean mapping
 */
@Mapper
public interface SelmaMapper {
//    @Maps(
//            withCustomFields = {
//                    @Field({"SourceBean.headCount", "TargetBean.companyCount"}),
//                    @Field({"SourceBean.departmentHashMap", "TargetBean.departmentHm"})
//            }
//    )
    TargetBean convert(SourceBean sourceBean);


    // 扁平化
    // 类型转换
//    @Maps(
//            withCustomFields = {
//                    @Field({"addressSM.addressName","addressName"}),
//                    @Field({"addressSM.addressNo","addressNo"})
//            }
//    )
//    TargetSM convertT(SourceSM sourceSM);
}

class calendarConvert{
    public Calendar timestamp2Calendar(Timestamp timestamp){
        return Calendar.getInstance();
    }
}
