package com.springboot.dao;

import com.springboot.entities.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {

    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userEmail", column = "user_email"),
            @Result(property = "userPassword", column = "user_password"),
    })

    @Select("select * from user where user_name = #{userName}")
    User getUserInfo(@Param("userName") String userName);

    @Insert("insert into user (user_name, user_email, user_password) values (#{userName}, #{userEmail}, #{userPassword})")
    int addUser(@Param("userName") String userName, @Param("userEmail") String userEmail, @Param("userPassword") String userPassword);

}
