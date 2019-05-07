package com.example.functiondemo.testdemos;

import java.util.function.Consumer;

public class ConsumerDemo {
    /*
       定义一个方法
       方法的参数传递一个字符串的姓名
       方法的参数传递Consumer接口,泛型使用String
       可以使用Consumer接口消费字符串的姓名
    */
    public static void method(String name, Consumer<String> con) {
        con.accept(name);
    }

    //定义一个方法,方法的参数传递一个字符串和两个Consumer接口,Consumer接口的泛型使用字符串
    public static void method(String s, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(s);
    }

    //定义一个方法,参数传递String类型的数组和两个Consumer接口,泛型使用String
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        method("小明", str -> {
            System.out.println(str);
        });
        method("xiaoming", str -> System.out.println(str.length()), str -> System.out.println(str.hashCode()));
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};
        /**
         * 练习:
         *         字符串数组当中存有多条信息，请按照格式“姓名：XX。性别：XX。”的格式将信息打印出来。
         *         要求将打印姓名的动作作为第一个Consumer接口的Lambda实例，
         *         将打印性别的动作作为第二个Consumer接口的Lambda实例，
         *         将两个Consumer接口按照顺序“拼接”到一起。
         */
        printInfo(arr,s-> System.out.print("姓名：".concat(s.split(",")[0]).concat(" "))
                ,s-> System.out.println("性别：".concat(s.split(",")[1])));
    }
}
