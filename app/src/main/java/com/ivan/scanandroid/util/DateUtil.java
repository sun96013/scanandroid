package com.ivan.scanandroid.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/12/6/006.
 */

public class DateUtil {
    /**
     * 获取当前时间
     *
     * @return
     */
     static String CurrentTime="";
    public static String getTime() {
        Date date = new Date();// 创建一个时间对象，获取到当前的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置时间显示格式
        CurrentTime = sdf.format(date);

        return CurrentTime;
    }
}
