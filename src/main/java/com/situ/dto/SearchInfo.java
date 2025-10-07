package com.situ.dto;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.util.List;

@Data
public class SearchInfo {
    private String sea_val;
    private String sea_col;
    private String sea_relation;

    //查询新增
    //List<searchitm>

    private  Long page;
    private  Long limit;
    //改成=号
    public Long getLimit(){
        return limit==null?100000:limit;
    }

    public <T> IPage<T> getPageInfo(Class<T> cls){
        //改成=号
        if(page==null) return null;
        IPage<T> po = new Page<T>(page, limit);
        return po;
    }
    public <T> QueryWrapper<T>  getQuery(QueryWrapper<T> ex,Class<T> cls){
        QueryWrapper<T> q =null;
        //改成=号
        if(ex==null) q=new QueryWrapper<T>();
        else q=ex;
        if(sea_val!=null) {
            //改成=号
            if(sea_relation==null) sea_relation="=";
            if(sea_relation.equals("=")) q.eq(sea_col,sea_val);
            else if(sea_relation.equals("like")) q.like(sea_col,sea_val);
        }
        return q;
    }
}
