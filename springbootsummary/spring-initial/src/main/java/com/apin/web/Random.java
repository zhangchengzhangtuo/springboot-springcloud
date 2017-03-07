package com.apin.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/2/15.
 */
@Component
public class Random {

    @Value("${com.apin.random.String}")
    private String randomString;

    @Value("${com.apin.random.Integer}")
    private Integer randomInt;

    @Value("${com.apin.random.Long}")
    private Long randomLong;

    @Value("${com.apin.random.Max}")
    private Integer randomMax;

    @Value("${com.apin.random.Min_max}")
    private Integer randomMinMax;

    public String getRandomString() {
        return randomString;
    }

    public void setRandomString(String randomString) {
        this.randomString = randomString;
    }

    public Integer getRandomInt() {
        return randomInt;
    }

    public void setRandomInt(Integer randomInt) {
        this.randomInt = randomInt;
    }

    public Long getRandomLong() {
        return randomLong;
    }

    public void setRandomLong(Long randomLong) {
        this.randomLong = randomLong;
    }

    public Integer getRandomMax() {
        return randomMax;
    }

    public void setRandomMax(Integer randomMax) {
        this.randomMax = randomMax;
    }

    public Integer getRandomMinMax() {
        return randomMinMax;
    }

    public void setRandomMinMax(Integer randomMinMax) {
        this.randomMinMax = randomMinMax;
    }
}
