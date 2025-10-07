package com.situ.controller;

/*import org.example.dto.ResultData;
import org.example.dto.ResultInfo;
import org.example.dto.SearchInfo;
import org.example.pojo.User;
import org.example.service.BaseService;
import org.example.service.User_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;*/
/*
import javax.servlet.http.HttpServletRequest;*/
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.situ.dto.ResultData;
import com.situ.dto.ResultInfo;
import com.situ.dto.SearchInfo;
import com.situ.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class BaseController<T> {

    @Autowired
    BaseService<T> myservice;

    private BaseService<T> getService() throws NoSuchFieldException, IllegalAccessException {
//        Field f=this.getClass().getDeclaredField("service");
//        f.setAccessible(true);//跳过安全检验
//        return (BaseService)f.get(this);
        return myservice;
    }

    private  Class<T> getTClass(){
        Class<?> subclass = this.getClass();
        Type genericSuperclass = subclass.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) genericSuperclass;
            return (Class<T>) pt.getActualTypeArguments()[0];
        }
        return null;
    }
    @RequestMapping("getArray")
    public String[]   getArray(String name) throws Exception {
        Class<T> cls=getTClass();
        Field f= cls.getField(name);
        return (String[])f.get(null);
    }
    @RequestMapping("getAll")
    public List<T> getAll() throws  Exception{
        SearchInfo info=new SearchInfo();
        info.setLimit(100000l);

        QueryWrapper<T> q=new QueryWrapper<>();
        Class cls=getTClass();
        try {
            cls.getDeclaredField("isdel");
            q.eq("isdel",0);
        }catch(Exception e){

        }
        ResultInfo result= getService().select(info,q);
        return result.getData();

        /*ResultInfo result= getService().select(info,null);
        return result.getData();*/
    }

    @RequestMapping("select")
    public ResultInfo select(SearchInfo sea) throws  Exception{
        return getService().select(sea,null);
    }

    @RequestMapping("insert")
    public ResultData insert(T t)throws Exception{
        getService().insert(t);
        return new ResultData(1);
    }

    @RequestMapping("update")
    public ResultData update(T t)throws Exception{
        getService().update(t);
        return new ResultData(1);
    }

    @RequestMapping("delete")
    public ResultData delete(int id)throws Exception{
        getService().delete(id);
        return new ResultData(1);
    }

    @RequestMapping("get")
    public T get(int id)throws Exception{
        return getService().getById(id);
    }

}