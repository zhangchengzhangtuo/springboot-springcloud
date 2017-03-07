package com.apin.web;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by Administrator on 2017/2/15.
 */
@RestController
@RequestMapping(value="/users")
public class UserController {

    static Map<Long,User> users= Collections.synchronizedMap(new HashMap<Long, User>());

    @ApiOperation(value="获取用户列表",notes="")
    @RequestMapping(value="/",method = RequestMethod.GET)
    public List<User> getUserList() throws Exception{
        if(users.size()==0){
            throw  new MyException("用户列表为空");
        }
        List<User> userList=new ArrayList<User>(users.values());
        return userList;
    }

    @ApiOperation(value="创建用户",notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value="/",method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user){
        users.put(user.getId(),user);
        return "success";
    }

    @ApiOperation(value="获取用户详情",notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        return users.get(id);
    }

    @ApiOperation(value="更新用户详细信息",notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    @RequestMapping(value="/{id}",method=RequestMethod.PUT)
    public String putUser(@PathVariable Long id,@ModelAttribute User user){
        User u=users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id,u);
        return "success";
    }

    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        users.remove(id);
        return "success";
    }

}
