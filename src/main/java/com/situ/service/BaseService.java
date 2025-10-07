package com.situ.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.situ.dto.ResultInfo;
import com.situ.dto.SearchInfo;

import java.util.List;

/*import org.example.app.dto.ResultInfo;
import org.example.app.dto.SearchInfo;


 */

public interface BaseService<T> {

    public ResultInfo select(SearchInfo sea, QueryWrapper<T> ex);
    public void insert(T u);
    public void update(T u);
    public void delete(int id);
    public T getById(int id);
    public List<T> SelectList(Wrapper<T> q);
}
