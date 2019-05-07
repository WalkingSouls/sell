package com.imooc.sell.utils;

import java.util.Random;

public class KeyUtil {
    /**生成唯一的主键 时间+随机数*/
    public static synchronized String getUniqueKey(){
        Integer num = new Random().nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(num);
    }
}
