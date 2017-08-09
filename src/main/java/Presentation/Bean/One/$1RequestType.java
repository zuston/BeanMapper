package Presentation.Bean.One;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * Created by zhang_jf on 2017/8/8.
 */
public class $1RequestType {
    private Integer saleCityId;
    private String saleCityName;
    private Calendar effectTime;
    private BigDecimal price;
    private Long providerId;
    private Short bidRanking;
    private Integer regionId;
    private String vendorName;
    private String createUser;
    private Calendar dataChangedCreateTime;
    private Long productId;
    private String message;
    private List<VBKReportBiddingDataType> vbkReportBiddingDataTypes;

    public $1RequestType() {
    }

    public $1RequestType(Integer saleCityId, String saleCityName, Calendar effectTime, BigDecimal price, Long providerId, Short bidRanking, Integer regionId, String vendorName, String createUser, Calendar dataChangedCreateTime, Long productId, String message, List<VBKReportBiddingDataType> vbkReportBiddingDataTypes) {
        this.saleCityId = saleCityId;
        this.saleCityName = saleCityName;
        this.effectTime = effectTime;
        this.price = price;
        this.providerId = providerId;
        this.bidRanking = bidRanking;
        this.regionId = regionId;
        this.vendorName = vendorName;
        this.createUser = createUser;
        this.dataChangedCreateTime = dataChangedCreateTime;
        this.productId = productId;
        this.message = message;
        this.vbkReportBiddingDataTypes = vbkReportBiddingDataTypes;
    }

    public Integer getSaleCityId() {
        return saleCityId;
    }

    public void setSaleCityId(Integer saleCityId) {
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

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public Short getBidRanking() {
        return bidRanking;
    }

    public void setBidRanking(Short bidRanking) {
        this.bidRanking = bidRanking;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
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

    public static $1RequestType generateSourceBean(){
        $1RequestType requestType = new $1RequestType();
        requestType.setCreateUser("cao_jl");
        requestType.setDataChangedCreateTime(Calendar.getInstance());
        requestType.setEffectTime(Calendar.getInstance());
        requestType.setMessage("error msg");
        requestType.setPrice(new BigDecimal(100));
        requestType.setProductId(100L);
        requestType.setSaleCityName("city");
        requestType.setSaleCityId(10);
        requestType.setBidRanking(new Short("10"));
        requestType.setProviderId(1000L);
        requestType.setRegionId(10);
        VBKReportBiddingDataType  vbkReportBiddingDataType = new VBKReportBiddingDataType(
                1000L,
                "hr003",
                1000L,
                "hr004",
                new BigDecimal(99),
                "34",
                "jiangsu"
        );
        requestType.setVbkReportBiddingDataTypes(new ArrayList<>(Arrays.asList(vbkReportBiddingDataType)));
        return requestType;
    }
}


class VBKReportBiddingDataType{
    private Long providerId;
    private String providerName;
    private Long pkgId;
    private String pkgName;
    private BigDecimal deductAmount;
    private String departureCityId;
    private String departureCityName;

    public VBKReportBiddingDataType(Long providerId, String providerName, Long pkgId, String pkgName, BigDecimal deductAmount, String departureCityId, String departureCityName) {
        this.providerId = providerId;
        this.providerName = providerName;
        this.pkgId = pkgId;
        this.pkgName = pkgName;
        this.deductAmount = deductAmount;
        this.departureCityId = departureCityId;
        this.departureCityName = departureCityName;
    }

    public VBKReportBiddingDataType() {
    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public Long getPkgId() {
        return pkgId;
    }

    public void setPkgId(Long pkgId) {
        this.pkgId = pkgId;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    public BigDecimal getDeductAmount() {
        return deductAmount;
    }

    public void setDeductAmount(BigDecimal deductAmount) {
        this.deductAmount = deductAmount;
    }

    public String getDepartureCityId() {
        return departureCityId;
    }

    public void setDepartureCityId(String departureCityId) {
        this.departureCityId = departureCityId;
    }

    public String getDepartureCityName() {
        return departureCityName;
    }

    public void setDepartureCityName(String departureCityName) {
        this.departureCityName = departureCityName;
    }
}


