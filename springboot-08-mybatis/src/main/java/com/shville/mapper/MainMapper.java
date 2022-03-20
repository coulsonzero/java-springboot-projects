package com.shville.mapper;


import com.shville.entity.UserData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MainMapper {
    @Select ("select * from users where username = #{username}")
    UserData getUserByName(String username);
}
