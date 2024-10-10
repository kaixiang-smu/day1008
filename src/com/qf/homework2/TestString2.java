package com.qf.homework2;

import java.util.Calendar;
import java.util.Scanner;

public class TestString2 {
    public static void main(String[] args) {

        Calendar instance = Calendar.getInstance();
        int index = instance.get(Calendar.DAY_OF_WEEK);
        String[] weekArr = {"","周日","周一","周二","周三","周四","周五","周六"};
        String week = weekArr[index];
        System.out.println("请输入车牌：");
        Scanner scanner = new Scanner(System.in);
        String carBand = scanner.nextLine();
        int number = 0;
        for (int i = carBand.length()-1; i >=0 ; i--) {
            if (Character.isDigit(carBand.charAt(i))) {
                //number = carBand.charAt(i);//原来是这一步出问题了！！！字符数字和数字还是不一样的
                number = Integer.parseInt(String.valueOf(carBand.charAt(i)));
                break;
            }
        }
        if (
                ((number == 1 || number == 6)&& week.equals("周一"))||
                ((number == 2 || number == 7)&& week.equals("周二"))||
                        ((number == 3 || number == 8)&& week.equals("周三"))||
                        ((number == 4 || number == 9)&& week.equals("周四"))||
                        ((number == 5 || number == 0)&& week.equals("周五"))
        ){
            System.out.println("限行");
        }else {
            System.out.println("不限行");
        }
    }
}
