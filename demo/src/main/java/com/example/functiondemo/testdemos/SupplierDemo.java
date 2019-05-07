package com.example.functiondemo.testdemos;

import java.util.function.Supplier;

public class SupplierDemo {
    //定义一个方法,方法的参数传递Supplier<T>接口,泛型执行String,get方法就会返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }
    //定义一个方法,用于获取int类型数组中元素的最大值,方法的参数传递Supplier接口,泛型使用Integer
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        String str = "喊喊";
        String string = getString(() -> str);
        System.out.println(string);
        Integer[] arr = {1,2,5,7,8,9,4,1};
        int maxInt = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });

        System.out.println(maxInt);
    }
}
