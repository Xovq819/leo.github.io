package com.situ.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
//@TableName("v_card")
@Data
public class Card {


    private Integer id;
    private String code;
    private Integer count;
    private Integer tocount;
    private Integer project_id;
    private String createdate;
    private Integer client_id;
    private Integer status;
    private Double price;
    private Integer user_id;
    private Integer payinfo_id;
    private Integer complte;
    private Integer isdel;

    //private String client_name;
    //private String project_name;

    public static String[] STATUSS={"未销","已销"};
    public String getStatusname() {return STATUSS[status]; }
}
