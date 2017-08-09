package Presentation.Bean.One;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

/**
 * Created by zhang_jf on 2017/8/8.
 *
 * 场景在于 数据库查询时候的 condition 生成，返回结果集的映射 等等
 */
public class $1ResponseType {
    private String saleCityId;
    private String saleCityName;
    private Calendar effectTime;
    private BigDecimal price;
    private String createUser;
    private Calendar dataChangedCreateTime;
    private Integer productId;
    private String message;
    private List<VBKReportBiddingDataType> vbkReportBiddingDataTypes;

    public $1ResponseType() {
    }

    public $1ResponseType(String saleCityId, String saleCityName, Calendar effectTime, BigDecimal price, String createUser, Calendar dataChangedCreateTime, Integer productId, String message, List<VBKReportBiddingDataType> vbkReportBiddingDataTypes) {
        this.saleCityId = saleCityId;
        this.saleCityName = saleCityName;
        this.effectTime = effectTime;
        this.price = price;
        this.createUser = createUser;
        this.dataChangedCreateTime = dataChangedCreateTime;
        this.productId = productId;
        this.message = message;
        this.vbkReportBiddingDataTypes = vbkReportBiddingDataTypes;
    }

    public String getSaleCityId() {
        return saleCityId;
    }

    public void setSaleCityId(String saleCityId) {
        this.saleCityId = saleCityId;
    }

    public String getSaleCityName() {
        return saleCityName;
    }

    public void setSaleCityName(String saleCityName) {
        this.saleCityName = saleCityName;
    }

    public Calendar getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Calendar effectTime) {
        this.effectTime = effectTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Calendar getDataChangedCreateTime() {
        return dataChangedCreateTime;
    }

    public void setDataChangedCreateTime(Calendar dataChangedCreateTime) {
        this.dataChangedCreateTime = dataChangedCreateTime;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<VBKReportBiddingDataType> getVbkReportBiddingDataTypes() {
        return vbkReportBiddingDataTypes;
    }

    public void setVbkReportBiddingDataTypes(List<VBKReportBiddingDataType> vbkReportBiddingDataTypes) {
        this.vbkReportBiddingDataTypes = vbkReportBiddingDataTypes;
    }
}
