package com.generatesql;


import com.util.GetChineseCharacter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Random;

/**
 * @author lyd
 * @date 2019/4/13
 * @time 11:12
 */
public class GenerateSql {
    public static void main(String[] args) {
        String path = "D:\\sql.txt";
        setFile(path,1000000);

    }

    private static void setFile(String path , int account) {
        File file = new File(path);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
            StringBuffer sb = new StringBuffer();
            String createDB = "DROP DATABASE IF EXISTS test_demo;\n" +
                    "CREATE DATABASE test_demo DEFAULT CHARACTER SET UTF8;\n" +
                    "CREATE TABLE test_one(id INT PRIMARY KEY AUTO_INCREMENT,NAME VARCHAR(64),gender VARCHAR(4),age INT);\n";
            sb.append(createDB);
            for (int i = 0; i <= account; i++) {
                String nameTemp = GetChineseCharacter.getName();
                String gender = nameTemp.substring(0, 1);
                String name = nameTemp.substring(1);
                int age = new Random().nextInt(110) + 1;
                String sql = "INSERT INTO `test_demo`.`test_one` (`name`, `gender`, `age`) VALUES ('" +
                        name +
                        "', '" +
                        gender +
                        "', '" +
                        age +
                        "');\n";
                sb.append(sql);
            }
            osw.write(sb.toString());
            osw.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
