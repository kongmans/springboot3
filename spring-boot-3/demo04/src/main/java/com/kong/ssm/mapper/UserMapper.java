package com.kong.ssm.mapper;

import com.kong.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User getUserById(@Param("id") Long id);

    List<User> getUsers();

    void addUser(User user);

}