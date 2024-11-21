package com.example.demo;

import com.example.demo.service.TestService;
import com.example.demo.service.TestService2;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DemoApplicationTests {

    //创建日志对象
    Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    private TestService testService;


    @Test
    void contextLoads(ApplicationContext context) {


        TestService2 test2 = context.getBean("test2", TestService2.class);
        test2.printTag();

       /*
        logger.info("我是info日志");
        logger.warn("我是warn日志");
        logger.error("我是error日志");
        testService.printTag();*/
    }

}
