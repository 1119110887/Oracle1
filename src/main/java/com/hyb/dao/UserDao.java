package com.hyb.dao;

import com.hyb.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Auther: 黄毅斌
 * @Description:
 * @Date: Created in 15:54 2020/7/3/003
 * @Modified By:
 */
public interface UserDao {

    @Select("select * from tb_user")
    List<User> findAll();

    @Insert("insert into tb_user (username,age) values(#{username},#{age})")
    Integer insertUser(User user);

    @Delete("delete from tb_user where username = #{username} and age = #{age}")
    Integer deleteUser(User user);

    @Update("update tb_user set age = #{age} where username = #{username}")
    Integer updateUser(User user);
}
