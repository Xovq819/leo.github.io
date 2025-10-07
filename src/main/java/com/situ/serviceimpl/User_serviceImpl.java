package com.situ.serviceimpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.situ.dto.ResultData;
import com.situ.dto.ResultInfo;
import com.situ.dto.SearchInfo;
import com.situ.mapper.User_Mapper;
import com.situ.pojo.User;
import com.situ.service.User_Service;
import com.situ.util.DateUtils;
import com.situ.util.Md5Utils;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;


@Service
public class User_serviceImpl extends BaseServiceImpl<User> implements User_Service {
    @Autowired
    User_Mapper mapper;
//新增查询
    @Override
    public ResultInfo select(SearchInfo sea, QueryWrapper<User> ex) {

       if (sea.getSea_val()==null){
           sea.setSea_col("status");
           sea.setSea_val("0");
       }
        return super.select(sea, ex);
    }

    @Override
    public void insert(User u) {
        u.setCreatedate(DateUtils.getNowtime());
        u.setPass(Md5Utils.md5("123"));
        super.insert(u);
    }


    @Override
    public ResultData login(User u, HttpSession session){
        List<User> list=mapper.selectList(new QueryWrapper<User>().eq("isdel",0).eq("name", u.getName()));
        if(list.size()!=1) return new ResultData(-1,"用户异常");
        User o=list.get(0);
        if( o.getStatus()==1) return new ResultData(-2,"用户权限异常");
        u.setPass(Md5Utils.md5(u.getPass()));
        if(!o.getPass().equals(u.getPass()))return new ResultData(-2,"用户密码错误");
        session.setMaxInactiveInterval(20*60);
        session.setAttribute("user",o);
        return new ResultData(1);
    }

    @Override
    public ResultData updatepass(String pass,String passl,String pass2,HttpSession session){
        User o= (User) session.getAttribute("user");
        pass= Md5Utils.md5(pass);
        if(!pass.equals(o.getPass())) return new ResultData(1,"原密码错误");
        String pass1 = null;
        if(!pass1.equals(pass2))return new ResultData(1,"新密码错误");
        pass1=Md5Utils.md5(pass1);
        o.setPass(pass1);
        mapper.update(null,new UpdateWrapper<User>().eq("id",o.getId()).set("pass",pass1));
        return new ResultData(1,"密码修改成功");
    }

}
