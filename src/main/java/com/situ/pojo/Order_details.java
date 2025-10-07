package com.situ.pojo;


import lombok.Data;

@Data
public class Order_details {

    private Integer isdel;
    private Integer id;
    private Integer main_id;
    private String date;
    private String info;
    private Integer item_id;
    private Integer status;
    private Integer user_id;
    private String comment;

    public static String[] STATUSS={"未查","正常","异常","警告"};
    public String getStatusname() {return STATUSS[status]; }


}
