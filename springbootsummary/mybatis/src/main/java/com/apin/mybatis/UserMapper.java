package com.apin.mybatis;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/16.
 */
@Mapper
public interface UserMapper {

    @Select("select * from person where name=#{name}")
    Person findByName(@Param("name")String name);

    @Insert("insert into person(name,age) values(#{name},#{age})")
    int insert(@Param("name")String name,@Param("age")Integer age);

    @Insert("insert into person(name,age) values(#{name},#{age})")
    int insertByMap(Map<String,Object> map);

    @Insert("insert into person(name,age) values(#{name},#{age})")
    int insertByPerson(Person person);

    @Update("update person set age=#{age} where name=#{name}")
    void update(Person person);

    @Delete("delete from person where name=#{name}")
    void delete(String name);

    @Results({
            @Result(property="name",column = "name"),
            @Result(property="age",column="age")
    })
    @Select("select * from person")
    List<Person> findAll();

}
