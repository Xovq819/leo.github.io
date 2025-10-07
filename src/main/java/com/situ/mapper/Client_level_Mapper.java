package com.situ.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.situ.pojo.Client_level;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Client_level_Mapper extends BaseMapper<Client_level> {

    @Select("select * from Client_level")
    List<Client_level> select();

}
