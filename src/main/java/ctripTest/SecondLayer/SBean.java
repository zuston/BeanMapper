package ctripTest.SecondLayer;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by zhang_jf on 2017/8/2.
 */
public class SBean {
    private String countryName;
    private List<ProvinceBean> provinceBeanList;

    public SBean(String countryName, List<ProvinceBean> provinceBeanList) {
        this.countryName = countryName;
        this.provinceBeanList = provinceBeanList;
    }

    public SBean() {
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
}
