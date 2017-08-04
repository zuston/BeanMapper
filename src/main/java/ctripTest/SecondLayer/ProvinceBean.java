package ctripTest.SecondLayer;

import java.util.List;

/**
 * Created by zhang_jf on 2017/8/2.
 */
public class ProvinceBean {
    private String provinceName;
    private Integer cityCount;
    private List<String> cityName;

    public ProvinceBean(String provinceName, Integer cityCount, List<String> cityName) {
        this.provinceName = provinceName;
        this.cityCount = cityCount;
        this.cityName = cityName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getCityCount() {
        return cityCount;
    }

    public void setCityCount(Integer cityCount) {
        this.cityCount = cityCount;
    }

    public List<String> getCityName() {
        return cityName;
    }

    public void setCityName(List<String> cityName) {
        this.cityName = cityName;
    }

    public ProvinceBean() {
    }


}
