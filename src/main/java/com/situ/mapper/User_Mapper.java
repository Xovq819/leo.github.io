package com.situ.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.situ.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface User_Mapper extends BaseMapper<User> {

    @Select("select * from User")
    List<User> select();

}
