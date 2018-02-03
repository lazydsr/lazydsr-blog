package com.lazydsr.blog.service.impl;

import com.lazydsr.blog.service.UserService;
import com.lazydsr.blog.entiry.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;

/**
 * UserServiceImpl
 * PROJECT_NAME: lazydsr-blog
 * PACKAGE_NAME: com.lazydsr.blog.Service.impl
 * Created by Lazy on 2018/2/3 16:50
 * Version: 0.1
 * Info: 用户service实现
 */
public class UserServiceImpl implements UserService {


    /**
     * 保存用户
     *
     * @param user user
     * @return User
     */
    @Override
    public User save(User user) {
        return null;
    }

    /**
     * 删除用户
     *
     * @param id id
     */
    @Override
    public void delete(Long id) {

    }

    /**
     * 删除列表里面的用户
     *
     * @param users users
     */
    @Override
    public void deleteUsersInBatch(List<User> users) {

    }

    /**
     * 更新用户
     *
     * @param user user
     * @return user
     */
    @Override
    public User update(User user) {
        return null;
    }

    /**
     * 根据id获取用户
     *
     * @param id id
     * @return user
     */
    @Override
    public User findById(Long id) {
        return null;
    }

    /**
     * 获取用户列表
     *
     * @return users
     */
    @Override
    public List<User> list() {
        return null;
    }

    /**
     * 根据用户名进行分页模糊查询
     *
     * @param name     name
     * @param pageable pageable
     * @return users
     */
    @Override
    public Page<User> findByNameLike(String name, Pageable pageable) {
        return null;
    }

    /**
     * 更具名称列表查询
     *
     * @param usernames usernames
     * @return users
     */
    @Override
    public List<User> findByUsernames(Collection<String> usernames) {
        return null;
    }
}
