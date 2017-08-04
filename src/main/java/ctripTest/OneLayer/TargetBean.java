package ctripTest.OneLayer;

import com.ctrip.tour.mapStruct.BeanMapper;
import com.ctrip.tour.selma.Bean.TargetSM;
import ctripTest.OneLayer.MapperInterface.MapStructMapper;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.mapstruct.factory.Mappers;
import org.modelmapper.ModelMapper;

/**
 * Created by zhang_jf on 2017/8/1.
 */
public class TargetBean {
    private String countryName;

    public TargetBean(String countryName) {
        this.countryName = countryName;
    }

    public TargetBean() {
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }


    // 测算时间
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Mapper mapper = new DozerBeanMapper();
        SourceBean sourceBean = new SourceBean("china");
        TargetBean targetBean = mapper.map(sourceBean, TargetBean.class);
        long endTime = System.currentTimeMillis();
        System.out.println("oneLayer dozer costTime : " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        SourceBean sb = new SourceBean("tokyo");
        TargetBean tb = MapStructMapper.MAP_STRUCT_MAPPER.convert(sb);
        endTime = System.currentTimeMillis();
        System.out.println("oneLayer mapstruct costTime : " + (endTime - startTime));

//        startTime = System.currentTimeMillis();
//        SourceBean sb2 = new SourceBean("tokyo");
//        TargetBean tb2 = new TargetBean(sb2.getCountryName());
//        endTime = System.currentTimeMillis();
//        System.out.println("oneLayer selma costTime : "+(endTime-startTime));

        startTime = System.currentTimeMillis();
        SourceBean sb2 = new SourceBean("tokyo");
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(com.ctrip.tour.MapperObject.SourceBean.class, com.ctrip.tour.MapperObject.TargetBean.class)
                .byDefault()
                .register();
        MapperFacade mapperFacade = mapperFactory.getMapperFacade();
        TargetBean targetBean3 = mapperFacade.map(sb2,TargetBean.class);
        endTime = System.currentTimeMillis();
        System.out.println("onelayer orika costTime : "+(endTime-startTime));

        startTime = System.currentTimeMillis();
        SourceBean sourceBean1 = new SourceBean("usa");
        ModelMapper modelMapper = new ModelMapper();
        TargetBean targetBean1 = modelMapper.map(sourceBean1,TargetBean.class);
        endTime = System.currentTimeMillis();
        System.out.println("onelayer modelMapper costTime : "+(endTime-startTime));

        startTime = System.currentTimeMillis();
        SourceBean sb5 = new SourceBean("tokyo");
        TargetBean tb5 = new TargetBean(sb5.getCountryName());
        endTime = System.currentTimeMillis();
        System.out.println("oneLayer handMapping costTime : " + (endTime - startTime));

    }
}



