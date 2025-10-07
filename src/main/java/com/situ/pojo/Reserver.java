package com.situ.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
//@TableName("v_reserver")
@Data
public class Reserver {

    private Integer id;
    private String date;
    private String todate;
    private String totime;
    private Integer client_id;
    private Integer project_id;
    private Integer status;
    private Integer isdel;

    //private String client_name;
    //private String project_name;

    //private Integer reserve_allcount;
    public static String[] STATUSS={"未到达","已到达"};
    public String getStatusname() {return STATUSS[status]; }
}
