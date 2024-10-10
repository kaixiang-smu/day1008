package com.qf.homework2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
// 341621200402261538
// 0123456789
public class TestString1 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身份证号：");
        String s = scanner.nextLine();
        String str = s.substring(6, 14);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date parse = sdf.parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int index = calendar.get(Calendar.DAY_OF_WEEK);
        // System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        /**
         * {"周日","周一","周二","周三","周四","周五","周六"}
         *    1      2     3     4      5     6      7   <---calendar.get(Calendar.DAY_OF_WEEK)返回的值
         * {"","周日","周一","周二","周三","周四","周五","周六"}
         *  0    1      2     3     4     5      6      7
         */
        String[] WeekArr = {"","周日","周一","周二","周三","周四","周五","周六"};
        String week = WeekArr[index];
        int i = Integer.parseInt(s.substring(17));
//        String gender;
//        if (i%2==0){
//            gender = "女";
//        }else {
//            gender = "男";
//        }
        String gender = i % 2 == 0 ? "女" : "男";
        System.out.println("性别："+gender+"，出生于"+year+"年"+month+"月"+day+"日，当日"+week);

        /**
        String str1 = s.substring(6, 10);
        String str2 = s.substring(10, 12);
        String str3 = s.substring(12, 14);
        Calendar instance = Calendar.getInstance();

        instance.set(Integer.parseInt(str1),Integer.parseInt(str2),Integer.parseInt(str3));
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH);
        int day = instance.get(Calendar.DAY_OF_MONTH);
        int week = instance.get(Calendar.DAY_OF_WEEK);

        System.out.println("出生于"+year+"年"+month+"月"+day+"日，当日周"+week);
         */

    }
}
