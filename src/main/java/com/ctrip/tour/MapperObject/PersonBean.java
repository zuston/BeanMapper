package com.ctrip.tour.MapperObject;

/**
 * Created by zhang_jf on 2017/7/31.
 */
public class PersonBean {
    private String personName;
    private Integer personAge;
    private String personEducation;

    public PersonBean(String personName, Integer personAge, String personEducation) {
        this.personName = personName;
        this.personAge = personAge;
        this.personEducation = personEducation;
    }

    public PersonBean() {
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }

    public String getPersonEducation() {
        return personEducation;
    }

    public void setPersonEducation(String personEducation) {
        this.personEducation = personEducation;
    }
}
