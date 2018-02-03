package com.lazydsr.blog.repository;

import com.lazydsr.blog.entiry.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * UserRepository
 * PROJECT_NAME: lazydsr-blog
 * PACKAGE_NAME: com.lazydsr.blog.repository
 * Created by Lazy on 2018/1/28 16:47
 * Version: 0.1
 * Info: @TODO:...
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * 根据用户姓名分页查询用户列表
     *
     * @param name     用户name
     * @param pageable pageable
     * @return 分页对象
     */
    Page<User> findByNameLike(String name, Pageable pageable);

    /**
     * 根据用户username查询用户
     *
     * @param username 账户
     * @return User
     */
    User findByUsername(String username);
}
