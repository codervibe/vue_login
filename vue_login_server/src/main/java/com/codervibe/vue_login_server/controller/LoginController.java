package com.codervibe.vue_login_server.controller;

import com.codervibe.vue_login_server.model.User;
import com.codervibe.vue_login_server.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2022/3/3 0003
 * DateTime:2022/03/03 14:30
 * Description:
 * Others:
 * @author Administrator
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class LoginController {
  Logger logger = LoggerFactory.getLogger(Logger.class);
  @Autowired
  private UserService userService;

  @PostMapping("/login")
  public Map<String, Object> login(@RequestBody User user) {
    logger.info("登录方法触发了");
    logger.info("user = " + user);
    Map<String, Object> map = new HashMap<>();
    try {
      userService.userLogin(user);
    } catch (Exception e) {
      e.printStackTrace();
      logger.error(e.getMessage());
      map.put("success", false);
      map.put("message", "用户登录失败" + e.getMessage());
    }
    map.put("success", true);
    map.put("message", "用户登录成功");
    return map;
  }

  @PostMapping("/register")
  public Map<String, Object> userRegister(@RequestBody User user) {
    logger.info("注册方法触发了");
    logger.info("user = " + user);
    Map<String, Object> map = new HashMap<>();
    try {
      userService.userRegister(user);
    } catch (Exception e) {
      e.printStackTrace();
      map.put("success", true);
      map.put("message", "用户注册成功" + e.getMessage());
    }
    map.put("success", true);
    map.put("message", "用户注册成功");
    return map;
  }
  @GetMapping("/getUserById")
  public void getUserById(String id){
    ArrayList<User> userById = userService.getUserById(id);
    User users = new User();
    for (User user : userById) {
      users = user;
    }
    System.out.println("users = " + users);
  }
}
