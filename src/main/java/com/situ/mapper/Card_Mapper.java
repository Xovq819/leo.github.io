package com.situ.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.situ.pojo.Card;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Card_Mapper extends BaseMapper<Card> {

    @Select("select * from Card")
    List<Card> select();

}
