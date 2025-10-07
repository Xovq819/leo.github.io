package com.situ.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.situ.pojo.Project_item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Project_item_Mapper extends BaseMapper<Project_item> {

    @Select("select * from Project_item")
    List<Project_item> select();

}
