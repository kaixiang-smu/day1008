package com.qf.api;

public class TestStringBuilder {

    public static void main(String[] args) {
        long begin = System.currentTimeMillis(); // 可以获得当前系统毫秒值
//        StringBuilder sb = new StringBuilder(""); // StringBuilder只需要10毫秒
//        StringBuffer sb = new StringBuffer(""); // StringBuffer需要22毫秒
        String sb = "";
        for (int i = 0; i < 1000000; i++) {
            //sb.append("1");
            sb+="1"; // 很慢很慢
        }
        long end = System.currentTimeMillis(); // 可以获得当前系统毫秒值
        System.out.println(end - begin);

    }
}
