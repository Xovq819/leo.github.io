package com.situ.config;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class test {
    public static void main1(String[] args)throws  Exception {

       Class cls= Class.forName("com.situ.pojo.User");
      Object u= cls.newInstance(); //        User u=new User();
       Field f= cls.getDeclaredField("name");
       f.setAccessible(true);//跳过安全
        f.set(u,"ssssssssssss");//  u.name=ssssssssss

       Method m= cls.getMethod("setId",Integer.class);
       Object reobj=m.invoke(u,100);// u.setId(100)

        System.out.println(u);
    }
}
