package com.codervibe.vue_login_server.service.Impl;

import com.codervibe.vue_login_server.Mapper.UserDao;
import com.codervibe.vue_login_server.model.User;
import com.codervibe.vue_login_server.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Administrator on 2022/3/3 0003
 * DateTime:2022/03/03 14:35
 * Description:
 * Others:
 *
 * @author Administrator
 */
@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
  Logger logger = LoggerFactory.getLogger(this.getClass());
  @Autowired private UserDao userDao;
  /**
   * 用户登录
   *
   * @param user
   */
  @Override
  public boolean userLogin(User user) {
    try {
      User resultuser = userDao.userLogin(user);
      logger.info("结果集 = 用户名" + resultuser.getUsername() + "密码 " + resultuser.getPassword());
      if (resultuser.getUsername() != null && resultuser.getPassword() != null) {
        //      logger.info("如果 查询出来的用户名和密码不为空 则 返回 true 否则 返回 false");
        return true;
      }

    } catch (NullPointerException e) {
      logger.error("空指针异常！！！");
    }
    return false;
  }

  /**
   * 用户注册方法
   *
   * @param user
   */
  @Override
  public void userRegister(User user) {
    Date date = new Date();
    logger.info("打印注册用户的信息 user = " + user);
    user.setCreateTime(date);
    logger.info("在注册用户类中 添加用户注册时间  userGetCreateTime =" + user.getCreateTime());
    logger.info("打印添加注册时间之后的 用户的信息 user = " + user);
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
