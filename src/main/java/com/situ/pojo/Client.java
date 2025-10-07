package com.situ.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
//@TableName("v_client")
@Data
public class Client {

    private Integer id;
    private String code;
    private String nike;
    private String pass;
    private String weixin;
    private Integer sex;
    private String qq;
    private String tel;
    private String tel2;
    ;
    private Integer status;
    private Integer level_id;
    private Integer point;
    private String srcinfo;
    private String createdate;
    private Integer card_id;
    private Integer isdel;
    private String comment;

    //private String level_name;
    //private String code_name;

    public static String[] STATUSS = {"空闲", "预约", "签到", "咨询"};

    public String getStatusname() {
        return STATUSS[status];
    }



}

