package com.ctrip.tour.mapStruct;

import com.ctrip.tour.MapperObject.SourceBean;
import com.ctrip.tour.MapperObject.TargetBean;
import com.ctrip.tour.mapStruct.Bean.SourceAMS;
import com.ctrip.tour.mapStruct.Bean.SourceBMS;
import com.ctrip.tour.mapStruct.Bean.SourceMS;
import com.ctrip.tour.mapStruct.Bean.TargetMS;
import com.ctrip.tour.mapStruct.BeanV2.ABean;
import com.ctrip.tour.mapStruct.BeanV2.BBean;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by zhang_jf on 2017/7/31.
 */

@Mapper
public interface BeanMapper {
    BeanMapper BEAN_MAPPER = Mappers.getMapper(BeanMapper.class);

    @Mappings({
            @Mapping(target = "companyName", ignore = true)
    })
    TargetBean convert(SourceBean sourceBean);

    // 类型转换，隐式转换 和 显式转换
    @IterableMapping(numberFormat = "$#.00")
    List<String> priceBigDecimal(List<Integer> price);

    @Mapping(target = "calendar", source = "calendar", dateFormat = "dd.MM.yyyy")
    TargetMS timeConvert(SourceMS sourceMS);

    // 只根据对象中的某一值改变来 更新转换对象
    void updateTargetMS(SourceMS sourceMS, @MappingTarget TargetMS targetMS);


    // 多个转换成一个
//    @Mappings({
//            @Mapping(target = "date", source = "SourceAMS.date"),
//            @Mapping(target = "timestamp", source = "SourceAMS.timestamp"),
//            @Mapping(target = "calendar", source = "SourceBMS.calendar", dateFormat = "yyyy.MM.dd")
//    })
//    TargetMS multiConversion(SourceAMS sourceAMS, SourceBMS sourceBMS);

    // set default value
    @Mapping(target = "calendar", source = "calendar", defaultValue = "null value")
    TargetMS defaultConversion(SourceBMS sourceBMS);


    BBean cc(ABean aBean);
}
