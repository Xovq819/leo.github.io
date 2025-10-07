package com.situ.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
//@TableName("v_order_main")
@Data
public class Order_main {

    private Integer id;
    private String date;
    private String info;

    private Integer client_id;
    private Integer project_id;
    private Integer check_user_id;


    private Integer user_id;
    private Integer isdel;

   // private String client_name;
    //private String project_name;
    //private String user_name;
    //private String main_date;
}
