package com.qf.api;

import java.util.Date;

public class TestDate {

    public static void main(String[] args) {
        // 创建当前时间
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getYear()+1900);
        System.out.println(date.getMonth()+1);
        System.out.println(date.getDate());

        // 获得当前时间毫秒值
        long time = date.getTime();
        System.out.println(time);

        // 设置毫秒值(改时间)
        date.setTime((long) 1000 * 60 * 60 * 24 * 365);
        System.out.println(date);
    }

    private static void show1() {
        // 创建当前时间
        Date date = new Date();
        System.out.println(date);

        // 以指定年月日，创建日期(过时了，不建议用)
        // 年需要-1900，月份0-11，天正常
        Date date1 = new Date(2000, 1, 1);
        System.out.println(date1);

        // 以指定毫秒值创建日期
        // ps：1秒=1000毫秒
        // 毫秒的基准点是1970-01-01 00：00：00
        Date date2 = new Date(24*3600*1000);
        System.out.println(date2);

        long l = System.currentTimeMillis();
        System.out.println(l);
        Date date3 = new Date(l);
        System.out.println(date3);
    }
}
