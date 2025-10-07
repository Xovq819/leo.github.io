package com.situ.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResultInfo {
    private  int code;
    private  String msg;
    private  long count;
    private List data;
    private Object obj;

    private  String params;

}
