package com.apin.database;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/15.
 */

public interface UserService {

    void create(String name,Integer age);

    void deleteByName(String name);

    Integer getAllUsers();

    void deleteAllUsers();

}
