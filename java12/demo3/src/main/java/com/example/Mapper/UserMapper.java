package com.example.Mapper;

import com.example.pojo.Result;
import com.example.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;


@Mapper
    public interface UserMapper {
        /**
         * 新增成员
         *
         * @param user
         * @return
         */
        @Insert("insert into userlogin(username, password)values(#{username}, #{password})")
        Result insert(User user);

    /**
     * 根据用户名和密码查询
     * @param user
     */
    @Select("select * from userlogin where username = #{username} and password = #{password}")
    User getByUsernameAndPassword(User user);
}

