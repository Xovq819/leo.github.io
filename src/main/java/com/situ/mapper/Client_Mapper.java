package com.situ.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.situ.pojo.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Client_Mapper extends BaseMapper<Client> {

    @Select("select * from Client")
    List<Client> select();

}
