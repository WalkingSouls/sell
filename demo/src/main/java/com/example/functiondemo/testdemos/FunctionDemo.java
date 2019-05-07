package com.example.functiondemo.testdemos;

import java.util.function.Function;

public class FunctionDemo {
    /**
     * 定义一个方法
     * 方法的参数传递一个字符串类型的整数
     * 方法的参数传递一个Function接口,泛型使用<String,Integer>
     * 使用Function接口中的方法apply,把字符串类型的整数,转换为Integer类型的整数
     */
    public static void convert(String s, Function<String, Integer> fun) {
        int apply = fun.apply(s);
        System.out.println(apply);
    }

    /**
     * 定义一个方法
     * 参数串一个字符串类型的整数
     * 参数再传递两个Function接口
     * 一个泛型使用Function<String,Integer>
     * 一个泛型使用Function<Integer,String>
     */
    public static void convert2(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String apply = fun1.andThen(fun2).apply(s);
        System.out.println(apply);
        System.out.println(apply.getClass());
    }
    /**
        定义一个方法
        参数传递包含姓名和年龄的字符串
        参数再传递3个Function接口用于类型转换
     */
    public static int convert3(String s, Function<String,String> fun1,
                               Function<String,Integer> fun2,Function<Integer,Integer> fun3) {
       return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        convert("1459", s -> Integer.parseInt(s));
        /*
         *  需求:
         *         把String类型的"123",转换为Inteter类型,把转换后的结果加10
         *         把增加之后的Integer类型的数据,转换为String类型
         */
        convert2("12358", s -> Integer.parseInt(s) + 10, s -> s + "");
        /*练习：自定义函数模型拼接
                题目
        请使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
        String str = "赵丽颖,20";

        分析:
        1. 将字符串截取数字年龄部分，得到字符串；
        Function<String,String> "赵丽颖,20"->"20"
        2. 将上一步的字符串转换成为int类型的数字；
        Function<String,Integer> "20"->20
        3. 将上一步的int数字累加100，得到结果int数字。
        Function<Integer,Integer> 20->120
        */
        int num = convert3("赵丽颖,20",s -> s.split(",")[1],
                s ->Integer.parseInt(s),i -> i+100);
        System.out.println(num);
    }

}
