package com.qf.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 格式化(日期--->字符串)
        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);

        // 解析(字符串--->日期)
        // 要想解析成功，字符串要符合模板要求
        String s = "2023-09-21 21:39:59";
        Date parse = sdf.parse(s);
        System.out.println(parse);

    }

}
