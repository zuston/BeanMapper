package ctripTest.OneLayer;

/**
 * Created by zhang_jf on 2017/8/1.
 */
public class SourceBean {
    private String countryName;

    public SourceBean(String countryName) {
        this.countryName = countryName;
    }

    public SourceBean() {
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
