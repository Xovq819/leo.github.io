package com.situ.service;

import com.situ.dto.ResultData;
import com.situ.pojo.User;

import javax.servlet.http.HttpSession;


public interface User_Service extends BaseService<User>{
    ResultData login(User u, HttpSession session);
    ResultData updatepass(String pass, String pass1, String pass2, HttpSession session);
}
