package com.lazydsr.blog.service;

import com.lazydsr.blog.entiry.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;

/**
 * UserService
 * PROJECT_NAME: lazydsr-blog
 * PACKAGE_NAME: com.lazydsr.blog.Service
 * Created by Lazy on 2018/2/3 16:49
 * Version: 0.1
 * Info: 用户service
 */
public interface UserService {
    /**
     * 保存用户
     *
     * @param user user
     * @return User
     */
    User save(User user);

    /**
     * 删除用户
     *
     * @param id id
     */
    void delete(Long id);

    /**
     * 删除列表里面的用户
     *
     * @param users users
     */
    void deleteUsersInBatch(List<User> users);

    /**
     * 更新用户
     *
     * @param user user
     * @return user
     */
    User update(User user);

    /**
     * 根据id获取用户
     *
     * @param id id
     * @return user
     */
    User findById(Long id);

    /**
     * 获取用户列表
     *
     * @return users
     */
    List<User> list();

    /**
     * 根据用户名进行分页模糊查询
     *
     * @param name     name
     * @param pageable pageable
     * @return users
     */
    Page<User> findByNameLike(String name, Pageable pageable);

    /**
     * 更具名称列表查询
     *
     * @param usernames usernames
     * @return users
     */
    List<User> findByUsernames(Collection<String> usernames);
}
