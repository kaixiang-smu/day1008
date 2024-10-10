package com.qf.api;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        // 因为是抽象类，不能直接new
        // 但是提供静态方法，调用可以获得对象
        // 默认是当前时间
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow);
        int year = rightNow.get(Calendar.YEAR);
        int month = rightNow.get(Calendar.MONTH);
        int day = rightNow.get(Calendar.DAY_OF_MONTH);
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        int min = rightNow.get(Calendar.MINUTE);
        int sec = rightNow.get(Calendar.SECOND);
        int week = rightNow.get(Calendar.DAY_OF_WEEK);

        System.out.println(year);
        System.out.println(month+1); // 月份从0开始
        System.out.println(day);
        System.out.println(hour);
        System.out.println(min);
        System.out.println(sec);
        System.out.println(week); // 1是周日，2是周一

        System.out.println("----------------------");
        rightNow.set(Calendar.YEAR,2023); // 按照字段设置值
        System.out.println(rightNow.get(Calendar.YEAR));

        rightNow.set(2020,10,6); // 直接设置年月日
        System.out.println(rightNow.get(Calendar.YEAR));
        System.out.println(rightNow.get(Calendar.MONTH)); // 不需要+1
        System.out.println(rightNow.get(Calendar.DAY_OF_MONTH));
    }
}
