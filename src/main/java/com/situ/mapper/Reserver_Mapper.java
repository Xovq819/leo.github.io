package com.situ.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.situ.pojo.Reserver;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Reserver_Mapper extends BaseMapper<Reserver> {

    @Select("select * from Reserver")
    List<Reserver> select();

}
