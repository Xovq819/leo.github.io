package com.situ.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@TableName("v_payinfo")
@Data
public class Payinfo {

    private Integer id;
    private String date;
    private Integer client_id;
    private Integer project_id;

    private Double price;
    private Integer paystatus;
    private Integer isdel;
    private String project_name;
    private Integer client_tel;


    public static String[] STATUSS={"未支付","已支付"};
    public String getstatusname() {return STATUSS[paystatus]; }
}
