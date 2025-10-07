package com.situ.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.situ.pojo.Payinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Payinfo_Mapper extends BaseMapper<Payinfo> {

    @Select("select * from Payinfo")
    List<Payinfo> select();

}
