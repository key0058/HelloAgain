package com.jchen.mapper;

import com.jchen.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository(value = "userMapper")
public interface UserMapper {

    @Select("select * from user where username = #{username} and password = #{password}")
    public User findUser(@Param("username") String username, @Param("password") String password);
}
