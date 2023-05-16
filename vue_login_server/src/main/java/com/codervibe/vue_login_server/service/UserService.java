package com.codervibe.vue_login_server.service;

import com.codervibe.vue_login_server.model.User;

import java.util.ArrayList;

/**
 * Created by Administrator on 2022/3/3  0003
 * DateTime:2022/03/03 14:31
 * Description:
 * Others:
 * @author Administrator
 */

public interface UserService {
    /**
     * 用户登录
     * @param user
     *
     */
  boolean userLogin(User user);

    /**
     * 用户注册方法
     * @param user
     */
    void userRegister(User user);
    /**
     * 根据Id 查询
     * @param id
     * @return
     */
    ArrayList<User> getUserById(String id);
}
