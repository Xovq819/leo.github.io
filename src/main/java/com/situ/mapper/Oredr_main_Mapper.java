package com.situ.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.situ.pojo.Order_main;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Oredr_main_Mapper extends BaseMapper<Order_main> {

    //@Select("select * from order_main")
    //List<Order_main> select();

}
