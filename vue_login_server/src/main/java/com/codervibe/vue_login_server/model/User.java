package com.codervibe.vue_login_server.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created by Administrator on 2022/3/3  0003
 * DateTime:2022/03/03 14:24
 * Description:
 * Others:
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class User {
    private int id;
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建时间
     */
//    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GTM+8")
    private Date createTime;

    /**
     * 角色访问权限
     */
    private String role;

    private static final long serialVersionUID = 1L;
}
