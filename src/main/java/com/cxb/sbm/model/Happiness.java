package com.cxb.sbm.model;

/**
 * Created by 81046 on 2018-05-11
 */
public class Happiness {
    private Integer id;
    private String city;
    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Happiness{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", num=" + num +
                '}';
    }
}
