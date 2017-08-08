package ctripTest.SecondLayer;

import com.ctrip.tour.MapperObject.PersonBean;
import com.ctrip.tour.ModelMapper.ModelMapper;
import com.ctrip.tour.mapStruct.BeanMapper;
import ctripTest.SecondLayer.MapperInterface.MapStructMapper;
import ctripTest.SecondLayer.MapperInterface.SelmaMapper;
import fr.xebia.extras.selma.Selma;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhang_jf on 2017/8/2.
 */
public class TBean {
    private String countryName;
    private List<ProvinceBean> provinceBeanList;

    public TBean(String countryName, List<ProvinceBean> provinceBeanList) {
        this.countryName = countryName;
        this.provinceBeanList = provinceBeanList;
    }

    public TBean() {
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<ProvinceBean> getProvinceBeanList() {
        return provinceBeanList;
    }

    public void setProvinceBeanList(List<ProvinceBean> provinceBeanList) {
        this.provinceBeanList = provinceBeanList;
    }


    public static void main(String[] args) {
//        Mapper mapper = new DozerBeanMapper();
//        long startTime = System.currentTimeMillis();
//        SBean sBean = generateSBean();
//        TBean tBean = mapper.map(sBean,TBean.class);
//        long endTime = System.currentTimeMillis();
//        System.out.println("twoLayer Dozer costTime : "+(endTime-startTime));

//        MapStructMapper sb = MapStructMapper.MAP_STRUCT_MAPPER;
//        long startTime = System.currentTimeMillis();
//        SBean sBean = generateSBean();
//        TBean tBean = sb.convert(sBean);
//        long endTime = System.currentTimeMillis();
//        System.out.println("twoLayer MapStruct costTime : "+(endTime-startTime));

        SelmaMapper selmaMapper = Selma.builder(SelmaMapper.class).build();
        long startTime = System.currentTimeMillis();
        SBean sBean = generateSBean();
        TBean tBean = selmaMapper.convert(sBean);
        long endTime = System.currentTimeMillis();
        System.out.println("twoLayer selma costTime : "+(endTime-startTime));

//        org.modelmapper.ModelMapper modelMapper = new org.modelmapper.ModelMapper();
//        long startTime = System.currentTimeMillis();
//        SBean sBean = generateSBean();
//        TBean tBean = modelMapper.map(sBean,TBean.class);
//        long endTime = System.currentTimeMillis();
//        System.out.println("twoLayer modelMapper costTime : "+(endTime-startTime));

//        long startTime = System.currentTimeMillis();
//        for (int i=0;i<100000;i++){
//            SBean sBean = generateSBean();
//            List<ProvinceBean> ll = sBean.getProvinceBeanList();
//            List<ProvinceBean> temp = new ArrayList<>();
//            for (ProvinceBean provinceBean : ll){
//                List<String> sbList = new ArrayList<>();
//                for (String s : provinceBean.getCityName())
//                    sbList.add(s);
//                ProvinceBean pb = new ProvinceBean(provinceBean.getProvinceName(),
//                        provinceBean.getCityCount(),
//                        sbList
//                );
//
//                temp.add(pb);
//            }
//            TBean tBean = new TBean(sBean.getCountryName(),temp);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("twoLayer HandMapper costTime : "+(endTime-startTime));

//        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
//        mapperFactory.classMap(com.ctrip.tour.MapperObject.SourceBean.class, com.ctrip.tour.MapperObject.TargetBean.class)
//                .byDefault()
//                .register();
//        MapperFacade mapperFacade = mapperFactory.getMapperFacade();
//        long startTime = System.currentTimeMillis();
//        SBean sBean = generateSBean();
//        TBean tBean = mapperFacade.map(sBean,TBean.class);
//        long endTime = System.currentTimeMillis();
//        System.out.println("twolayer orika costTime : "+(endTime-startTime));

    }

    public static SBean generateSBean(){
        ProvinceBean provinceBean1 = new ProvinceBean("江苏",20,
                Arrays.asList("南京","扬州","苏州","徐州","台州"));
        ProvinceBean provinceBean2 = new ProvinceBean("江西",20,
                Arrays.asList("南京","扬州","苏州","徐州","台州"));
        ProvinceBean provinceBean3 = new ProvinceBean("新疆",20,
                Arrays.asList("南京","扬州","苏州","徐州","台州"));
        ProvinceBean provinceBean4 = new ProvinceBean("黑龙江",20,
                Arrays.asList("南京","扬州","苏州","徐州","台州"));

        SBean sBean = new SBean("中国",Arrays.asList(provinceBean1,provinceBean2,provinceBean3,provinceBean4));

        return sBean;
    }
}
