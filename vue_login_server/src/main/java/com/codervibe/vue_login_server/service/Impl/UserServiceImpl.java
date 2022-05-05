package com.codervibe.vue_login_server.service.Impl;

import com.codervibe.vue_login_server.Mapper.UserDao;
import com.codervibe.vue_login_server.model.User;
import com.codervibe.vue_login_server.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2022/3/3 0003
 * DateTime:2022/03/03 14:35
 * Description:
 * Others:
 * @author Administrator
 */
@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
  @Autowired
  private UserDao userDao;
  /**
   * 用户登录
   *
   * @param user
   */
  @Override
  public void userLogin(User user) {
    userDao.userLogin(user);
  }

  /**
   * 用户注册方法
   *
   * @param user
   */
  @Override
  public void userRegister(User user) {
    Date date=new Date();
    System.out.println("UserService  user = " + user);
    user.setCreateTime(date);
    System.out.println("UserService userGetCreateTime ="+user.getCreateTime());
    System.out.println("UserService  user = " + user);
    userDao.userRegister(user);
  }

  /**
   * 根据Id 查询
   *
   * @param id
   * @return
   */
  @Override
  public ArrayList<User> getUserById(String id) {
    ArrayList<User> ArraysUser = userDao.getUserById(id);
    return ArraysUser;
  }


}
