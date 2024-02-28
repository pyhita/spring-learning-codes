package com.yangtao.mapper;

import com.yangtao.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("SELECT id, username, name, birthday FROM tbl_user")
    List<User> getUsers();
}
