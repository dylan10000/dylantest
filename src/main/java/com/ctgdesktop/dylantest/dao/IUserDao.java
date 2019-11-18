package com.ctgdesktop.dylantest.dao;

import com.ctgdesktop.dylantest.entity.User;
import com.ctgdesktop.dylantest.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public interface IUserDao extends UserMapper {
    List<User> findByName(@Param("userName") String username);

    User selectById(@Param("id") Integer id);
}