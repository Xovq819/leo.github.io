package com.situ.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.situ.pojo.Order_details;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Order_details_Mapper extends BaseMapper<Order_details> {

    @Select("select * from Order_details")
    List<Order_details> select();

}
