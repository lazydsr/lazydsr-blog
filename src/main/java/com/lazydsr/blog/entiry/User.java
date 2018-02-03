package com.lazydsr.blog.entiry;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * User
 * PROJECT_NAME: lazydsr-blog
 * PACKAGE_NAME: com.lazydsr.blog.entiry
 * Created by Lazy on 2018/1/28 16:44
 * Version: 0.1
 * Info: User实体
 */
@Table(name = "user")
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "账号不能为空")
    @Size(min = 4, max = 100)
    @Column(nullable = false, length = 100, unique = true)
    private String username;
    @NotEmpty(message = "密码不能为空")
    @Size(min = 4, max = 300)
    @Column(nullable = false, length = 300)
    private String password;
    @NotEmpty(message = "姓名不能为空")
    @Size(min = 1, max = 100)
    @Column(nullable = false, length = 100)
    private String name;
    @Column(length = 100, unique = true)
    @Email(message = "邮箱格式不正确")
    private String email;
    @Column(length = 100)
    private String mobile;
    @Column(length = 500)
    private String avatar;


}
