package com.ctrip.tour.mapStruct.BeanV2;

import java.util.List;

/**
 * Created by zhang_jf on 2017/8/7.
 */
public class ABean {
    private List<AChildBean> aChildBeans;

    public ABean() {
    }

    public ABean(List<AChildBean> aChildBeans) {
        this.aChildBeans = aChildBeans;
    }

    public List<AChildBean> getaChildBeans() {
        return aChildBeans;
    }

    public void setaChildBeans(List<AChildBean> aChildBeans) {
        this.aChildBeans = aChildBeans;
    }
}
