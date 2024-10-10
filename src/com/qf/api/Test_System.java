package com.qf.api;

public class Test_System {
    public static void main(String[] args) {
        // 系统类提供的 正常输出：System.out.println()
        // 系统类提供的 错误输出：System.err.println()
        System.err.println("Exception in thread \"main\" NullPointerException");

        long l = System.currentTimeMillis();
        System.out.println(l);

    }
}
