package com.qf.homework2;

import java.util.Arrays;
import java.util.UUID;

public class TestString {
    public static void main(String[] args) {

        //int i = getCiShu("ecust", 'c');
        //System.out.println(i);
        //System.out.println(getCiShu("zhangkaixiang", 'a'));

        //String s = changeStr("abc123ABCD");
        //System.out.println(s);

        //System.out.println(getInt("abc1uy23p1"));
        //System.out.println(getInt("abc1uy20p24"));

        //System.out.println(reverseStr("12345"));
        //System.out.println(reverseStr("abcdef"));

        //printStrCount("111212213332");

        strSplit();

        printName("zhengcg@zparkhr.com");
    }

    // 1、写方法public static int getCiShu(String s,char c);获取s中c出现的次数
    public static int getCiShu(String s,char c){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (c==c1){
                count++;
            }
        }
        return count;
    }
    // 2、写方法public static String changeStr(String s);对s进行转换,大写转换为小写 小写转换为大写,删除数字
    // 如:abc123ABCD---->ABCabcd
    public static String changeStr(String s){
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (Character.isUpperCase(ch)) {
                char c = Character.toLowerCase(ch);
                sb.replace(i,i+1,String.valueOf(c));
            }else if (Character.isLowerCase(ch)){
                char c = Character.toUpperCase(ch);
                sb.replace(i,i+1,String.valueOf(c));
            }else if (Character.isDigit(ch)){
                sb.delete(i,i+1); // 将本身的数字删除
                // 因为删除了自己的内容，本身长度变短，遍历就会跳过一个数据
                // 所以删除完数字，遍历的下标后退一位
                i--;
            }
        }
        return String.valueOf(sb);
    }

    /**
    public static String changeStr(String s){
        char[] chars = s.toCharArray();
        String newStr = "";
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                char c = Character.toLowerCase(chars[i]);
                newStr+=c;
            }else if (Character.isLowerCase(chars[i])){
                char c = Character.toUpperCase(chars[i]);
                newStr+=c;
            }
        }
        return newStr;
    }
    */

    /**
     * 我第一遍写的：输出是ABC   abcd，中间三个空格，解决不了
    public static String changeStr(String s){
        char[] chars = s.toCharArray();
        int count = 0;
        char[] chars1 = new char[chars.length - count];
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                if (Character.isUpperCase(chars[i])) {
                    chars1[i] = Character.toLowerCase(chars[i]);
                }else {
                    chars1[i] = Character.toUpperCase(chars[i]);
                }
            }else{
                count++;
            }
        }
        String s1 = String.valueOf(chars1);
        return s1;
    }
     */

    // 3、写方法public static int getInt(String s) 获取参数字符串s中所有数字字符组成的最大整数
    // 如：abc1uy23p1--->3211
    public static int getInt(String s){
        char[] chars = s.toCharArray();
        String str = "";
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])){
                str+=chars[i];
            }
        }
        char[] chars1 = str.toCharArray();
        Arrays.sort(chars1);
        String numStr = "";
        for (int i = chars1.length-1; i >= 0; i--) {
            numStr+=chars1[i];
        }
        return Integer.parseInt(numStr);
    }
    // 4、写方法public static String reverseStr(String s) 把参数字符串反转
    public static String reverseStr(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        //return String.valueOf(sb);
        return sb.toString();
    }
    // 5、写方法public static void printStrCount(String str)
    // 给定一个由数字组成的字符串如：“111212213332”统计出每个数字出现的次数
    public static void printStrCount(String str){
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            System.out.println("字符"+str.charAt(i)+"出现"+count+"次");
        }
    }
    // 6、将随机获取的UUID(含义是通用唯一识别码Universally Unique Identifier)中的“-”
    // 提示：java.util.UUID.randomUUID.toString()//可以获取随机UUID
    // 格式：e6c57443-1667-4d75-98f6-a8863d95e58f
    public static void strSplit(){
        UUID uuid = new UUID(100000,100000);
        String s = uuid.toString();
        String[] split = s.split("-");
        String str = "";
        for (int i = 0; i < split.length; i++) {
            str+=split[i];
        }
        System.out.println(str);
    }

    // 7、获取邮箱“zhengcg@zparkhr.com”中的用户名“zhengcg”
    public static void printName(String email){
        String[] split = email.split("@");
        String name = split[0];
        System.out.println(name);
    }
}
