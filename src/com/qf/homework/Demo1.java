package com.qf.homework;

import java.util.Scanner;

/**
 * 模拟用户登录功能
 * 需求：模拟用户登录，给三次机会，并提示还有几次机会；
 * 用户名admin，密码123456，登录成功/失败给予提示(考察equals)
 * -----------------------------
 * 写程序：人性化，健全，健壮性
 * -----------------------------
 * 边写边读，争取做到读完的结果跟运行的结果一致
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("欢迎进入华东理工大学研究生系统，请登录~");
        System.out.println("温馨提示：您一共有三次登录机会~");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("现在您还剩余"+(3-i)+"次登录机会");
            System.out.println("请输入用户名：");
            String userName = scanner.nextLine();
            System.out.println("请输入密码：");
            String passWord = scanner.nextLine();
            if ("".equals(userName) || "".equals(passWord)){
                System.out.println("用户名或密码不能为空！");
            } else if ("admin".equals(userName) && "123456".equals(passWord)) {
                System.out.println("登录成功！");
                break;
            }else {
                if (i<2){
                    System.out.println("用户名或密码输入错误，请重新输入");
                }else {
                    System.out.println("连续输错三次，用户已锁定");
                }
            }
        }
        scanner.close();
    }
}
