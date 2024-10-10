package com.qf.api;

import java.util.Arrays;

public class TestString {
    public static void main(String[] args) {

        // String concat(String str) 将指定字符串连接到此字符串的结尾
        System.out.println("kai".concat("xiang"));

        // int length()返回此字符串的长度
        System.out.println("java".length());

        // String[] split(String regex)根据给定正则表达式的匹配拆分此字符串
        String[] split = "java".split("");
        System.out.println(Arrays.toString(split));
        String[] split1 = "j-a-v-a".split("-");
        System.out.println(Arrays.toString(split1));
        // .是正则表达式的运算符，需要转义成字符.
        String[] split2 = "java从入门到精通.docx".split("\\.");
        System.out.println(Arrays.toString(split2));

        // String trim()返回字符串的副本，忽略前导空白和尾部空白
        System.out.println("java".trim());
        System.out.println("   java   ".trim());


    }

    private static void show6() {
        // String substring(int beginIndex) 返回一个新的字符串，它是此字符串的一个子字符串
        String s = "java".substring(1);
        System.out.println(s);

        // String substring(int beginIndex,int endIndex) 返回一个新字符串，它是此字符串的一个子字符串
        // 该子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符。
        // 因此，该子字符串的长度为 endIndex-beginIndex。
        String s1 = "zhangkaixiang".substring(5, 8);
        System.out.println(s1);

        // String replace(char oldChar, char newChar) 返回一个新的字符串，它是通过用newChar替换此字符串中出现的所有 oldChar得到的
        System.out.println("JavaSE".replace('S', 'E'));
        // String replaceAll(String regex, String replacement)
        // regex 正则表达式，学前端再讲
    }

    private static void show5() {
        //byte[] getBytes() 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
        byte[] bytes = "java".getBytes();

        //char[] toCharArray()将此字符串转换为一个新的字符数组
        char[] chars = "java".toCharArray();

        //String toLowerCase()使用默认语言环境的规则将此 String中的所有字符都转换为小写
        System.out.println("JAVA".toLowerCase());

        //String toUpperCase()使用默认语言环境的规则将此 String 中的所有字符都转换为大写
        System.out.println("java".toUpperCase());

        //static String valueOf(boolean b)
        // 返回 boolean 参数的字符串表示形式
        // 提供了多个重载方法，可以将大部分类型都转换成String
        // 注意，该方法是静态的，用类名去调用该方法
        String.valueOf(1);
    }

    private static void show4() {
        // boolean contains(CharSequence s)当且仅当此字符串包含指定的 char 值序列时，返回 true
        // 方法的参数列表是接口，传的是接口的实现类，就是String字符串
        System.out.println("java".contains("ja"));
        // boolean endsWith(String suffix)测试此字符串是否以指定的后缀结束
        System.out.println("java".endsWith("a"));
        // 场景：用来判断文件格式
        System.out.println("a.txt".endsWith("txt"));
        // boolean startsWith(String prefix)测试此字符串从指定索引开始的子字符串是否以指定前缀开始
        System.out.println("a.txt".startsWith("a"));
        // boolean equals(Object anObject)将此字符串与指定的对象比较
        String a = "a";
        String a2 = "a";
        System.out.println(a.equals(a2));
        // boolean equalsIgnoreCase(String anotherString)将此String与另一个 String比较，不考虑大小写
        System.out.println("JAVA".equals("java"));
        System.out.println("JAVA".equalsIgnoreCase("java"));
        // boolean isEmpty()当且仅当 length() 为0 时返回 true
        System.out.println("".isEmpty());
        System.out.println("java".isEmpty());
    }

    private static void show3() {
        // char charAt(int index)返回指定索引处的 char 值
        // 根据下标找字符
        char c = "java".charAt(0);
        System.out.println(c);

        // int indexOf(int ch)返回指定字符在此字符串中第一次出现处的索引。
        // 其实有很多重载的方法，可以传字符串
        // 找不到返回-1
        // 根据字符找下标
        // 场景：可以用来判断是否包含
        int i = "java".indexOf('a');
        System.out.println(i);

        // int lastIndexOf(int ch)返回指定字符在此字符串中最后一次出现处的索引
        int i1 = "java".lastIndexOf("a");
        System.out.println(i1);
    }

    private static void show2() {
        String s = new String();
        // String s2 = ""; // 与上方等价
        System.out.println(s);

        // 将字节数组转为字符串
        byte[] bytes = {65,66,67};
        String s3 = new String(bytes);
        System.out.println(s3);
        // 一般会用在数据传输(IO) 网络通信

        // 将字符数组转字符串
        char[] chars = {'a','b','c'};
        String s4 = new String(chars);
        System.out.println(s4);

        // 创建一个字符串副本
        //String s5 = new String("java");

        // 总结：最常见的创建字符串的方式
        String s6 = "java";
    }

    private static void show1() {
        String name = "张三"; // name就是String类的对象
        // name所代表的"张三"在内存是常量
        name.toString();
        name = "李四"; // 这样去写，只是name这个变量不再引用"张三"，而是引用"李四"
    }

}
