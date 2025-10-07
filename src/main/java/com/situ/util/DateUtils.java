package com.situ.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String getNowtime(){
        return new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date());
    }
}
