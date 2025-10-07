package com.situ.pojo;


import lombok.Data;

@Data
public class Reserver_limit {

    private Integer id;
    private String date;
    private String time;
    private Integer allcount;
    private Integer count;
    private Integer status;
    private Integer isdel;

    public static String[] STATUSS={"可约","停约"};
    public String getStatusname() {return STATUSS[status]; }
}
