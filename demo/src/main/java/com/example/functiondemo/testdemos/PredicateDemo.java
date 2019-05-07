package com.example.functiondemo.testdemos;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    public static boolean checkStringAnd(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.and(pre2).test(s);
    }

    public static boolean checkStringOr(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.or(pre2).test(s);
    }

    public static boolean checkStringNegate(String s, Predicate<String> pre1) {
        return pre1.negate().test(s);
    }
    public static ArrayList<String> checkStringMultiple(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean result = pre1.and(pre2).test(s);
            if(result)
                list.add(s);
        }
        return list;
    }


    public static void main(String[] args) {
        boolean boo = checkString("abcd", s -> s.length() > 5);
        System.out.println(boo);
        /**需求:判断一个字符串,有两个判断的条件
         1.判断字符串的长度是否大于5
         2.判断字符串中是否包含a
         两个条件必须同时满足,我们就可以使用&&运算符连接两个条件
         */
        boolean a = checkStringAnd("123456789adsfds", s -> s.length() > 5, s -> s.contains("a"));
        System.out.println(a);
        /**
         需求:判断一个字符串,有两个判断的条件
         1.判断字符串的长度是否大于5
         2.判断字符串中是否包含a
         满足一个条件即可,我们就可以使用||运算符连接两个条件
         */
        boolean b = checkStringOr("123as", s -> s.length() > 5, s -> s.contains("a"));
        System.out.println(b);
        /**
         需求:判断一个字符串长度是否大于5
         如果字符串的长度大于5,那返回false
         如果字符串的长度不大于5,那么返回true
         所以我们可以使用取反符号!对判断的结果进行取反
         */
        System.out.println(checkStringNegate("12345", s -> s.length() > 5));
        /**
         练习：集合信息筛选
         数组当中有多条“姓名+性别”的信息如下，
         String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
         请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，
         需要同时满足两个条件：
         1. 必须为女生；
         2. 姓名为4个字。

         分析:
         1.有两个判断条件,所以需要使用两个Predicate接口,对条件进行判断
         2.必须同时满足两个条件,所以可以使用and方法连接两个判断条件
         */
        String[] arr = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        ArrayList<String> list = checkStringMultiple(arr, s ->
            s.split(",")[1].equals("女")
        , s -> s.split(",")[0].length() == 4);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
