package com.situ.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.situ.pojo.Communicate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Communicate_Mapper extends BaseMapper<Communicate> {

    @Select("select * from Communicate")
    List<Communicate> select();

}
