package com.apin.mybatis;

import org.json.JSONObject;

/**
 * Created by Administrator on 2017/2/16.
 */
public class Person {

    private String name;

    private Integer age;

    public Person(String name,Integer age){
        this.name=name;
        this.age=age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString(){
        return toJson().toString();
    }

    public JSONObject toJson(){
        JSONObject json=new JSONObject();
        json.put("name",name);
        json.put("age",age);
        return json;
    }
}
