package com.apin.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/2/15.
 */
@Component
public class BlogProperties {

    @Value("${com.apin.blog.name}")
    private String name;

    @Value("${com.apin.blog.title}")
    private String title;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
