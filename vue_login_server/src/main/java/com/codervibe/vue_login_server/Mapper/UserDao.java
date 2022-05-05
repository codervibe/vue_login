package com.codervibe.vue_login_server.Mapper;

import com.codervibe.vue_login_server.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2022/3/3  0003
 * DateTime:2022/03/03 14:36
 * Description:
 * Others:
 * @author Administrator
 */
@Mapper
public interface UserDao {
    /**
     * 用户登录
     * @param user
     */
    void userLogin(User user);

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
