package com.lazydsr.blog.repository;

import com.lazydsr.blog.entiry.User;
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

}
