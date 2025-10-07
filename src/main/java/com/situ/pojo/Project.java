package com.situ.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@TableName("v_project")
@Data
public class Project {

    private Integer id;
    private String name;
    private String info;

    private Double price;
    private Integer count;
    private Integer status;
    private String item_ids;
    private String pic;
    private Integer isdel;
    private String item_name;

    public static String[] STATUSS={"可用","禁用"};
    public String getStatusname() {return STATUSS[status]; }

}
