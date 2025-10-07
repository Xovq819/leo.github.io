package com.situ.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.situ.pojo.Reserver_limit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Reserver_limit_Mapper extends BaseMapper<Reserver_limit> {

    @Select("select * from Reserver_limit")
    List<Reserver_limit> select();

}
