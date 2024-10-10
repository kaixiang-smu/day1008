package com.qf.homework;
// 字符串遍历
public class Demo2 {
    public static void main(String[] args) {
        String str = "javabigdata";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("-------------------------");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
        System.out.println("-------------------------");
        String[] split = str.split("");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
