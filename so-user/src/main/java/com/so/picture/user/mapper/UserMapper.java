package com.so.picture.user.mapper;


import com.so.picture.user.entry.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT user_name userName,user_movie userMovie FROM user_info where USER_id = #{userId}")
    User queryUserById(@Param("userId") int userId);
}
