package com.imooc.sell;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest {
    private final static Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        logger.info("info...");
        logger.error("error...");
        logger.debug("debug...");
        logger.trace("trace...");
        logger.warn("warn...");
    }
    @Test
    public void test2(){
        String username = "zhangsan";
        String password = "18";
        logger.info("username:{},password:{}",username,password);
        logger.debug("debug...");
        logger.error("error...");
    }
}
