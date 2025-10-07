package com.situ.pojo;


import lombok.Data;

@Data
public class Communicate {


    private Integer id;
    private String date;
    private String info;
    private Integer client_id;
    private Integer main_id;
    private Integer user_id;
    private String comments;
    private Integer isdel;
}
