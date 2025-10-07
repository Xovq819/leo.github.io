package com.situ.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.situ.dto.ResultData;
import com.situ.dto.ResultInfo;
import com.situ.pojo.User;
import com.situ.service.User_Service;

import jdk.net.SocketFlow;
import net.sf.jsqlparser.statement.select.AllColumns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/User")
class User_Controller extends BaseController<User> {
    @Autowired
    User_Service service;

    @PostMapping("login")
    public ResultData login(User u, HttpSession session) {
        return service.login(u, session);
    }

    @PostMapping("updatepass")
    public ResultData updatepass(String pass, String pass1, String pass2, HttpSession session) {
        return service.updatepass(pass, pass1, pass2, session);
    }

    @RequestMapping("self")
    public Object self(HttpSession session) throws Exception {
        return session.getAttribute("user");
    }

    @RequestMapping("outlogin")
    public void outlogin(HttpSession session, HttpServletResponse resp) throws Exception {
        session.removeAttribute("name");
        resp.sendRedirect("/login.html");

    }

    @RequestMapping("report")
    public ResultInfo report() {
        List<User> list = service.SelectList(new QueryWrapper<User>().select("count(1) id", "status").groupBy("status").eq("isdel", 0));
        ResultInfo info=new ResultInfo();
        info.setData(list);
        info.setObj(User.STATUSS);
        return info;
    }
}