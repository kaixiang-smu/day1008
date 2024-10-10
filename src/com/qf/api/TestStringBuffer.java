package com.qf.api;

public class TestStringBuffer {

    public static void main(String[] args) {

        // StringBuffer(String str)
        // 构造一个初始化为指定字符串内容的字符串缓冲区
        StringBuffer sb = new StringBuffer("java");
        System.out.println(sb);
        // java
        // StringBuffer append(boolean b)追加的 boolean参数序列的字符串表示形式
        //ps:有很多append的重载方法，用于追加大多数类型
        StringBuffer sb2 = sb.append("bigdata");
        System.out.println(sb);
        System.out.println(sb2);

        // javabigdata
        // StringBuffer delete(int start,int end)删除的字符在字符串序列分析
        sb.delete(4,7);
        System.out.println(sb);

        // javadata
        // StringBuffer deleteCharAt(int index)删除 char在指定的位置在这个序列
        sb.deleteCharAt(4);
        System.out.println(sb);

        // javaata
        // StringBuffer insert(int offset,boolean b) 插入的 boolean参数的字符串表示形式进入这个序列。 ps: 参数2支持大部分类型
        // ps:insert方法有10+多个重载的方法，可以插入大部分数据类型的数据
        // offset 偏移量
        sb.insert(4,'d');
        System.out.println(sb);

        // javadata
        // StringBuffer replace(int start,int end,String str)在一个字符串中替换指定的String字符这个序列的特征
        sb.replace(1,4,"AVA");
        System.out.println(sb);

        // jAVAdata
        // void setCharAt(int index,char ch)指定索引处的字符设置为 ch
        sb.setCharAt(4,'D');

        // jAVAdata
        // StringBuffer reverse() 使这个字符序列被序列的反转所取代
        StringBuffer buffer = new StringBuffer("java");
        buffer.reverse();
        System.out.println(buffer);

        // 练习
        int num = 12345;
        String s = String.valueOf(num); // int--->String
        StringBuffer buffer1 = new StringBuffer(s); // String--->StringBuffer
        buffer1.reverse(); // 反转
        String s1 = String.valueOf(buffer1); // StringBuffer--->String
        int i = Integer.parseInt(s1); // String--->int
        System.out.println(i);
    }
}
