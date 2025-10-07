package com.situ.pojo;


import lombok.Data;

@Data
public class User {

    private Integer id;
    private String name;
    private String pass;
    private Integer power;
    private Integer status;
    private Integer department_id;
    private String createdate;
    private Integer isdel;

    //private Integer department_id;
    public static String[] POWERS = {"管理员", "操作员"};
    public String getPowersname() {
        if(power==null) return "";
        return POWERS[power];
    }

    public static String[] STATUSS = {"在职", "离职"};
    public String getStatusname() {
        return STATUSS[status];
    }


}
