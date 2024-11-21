package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Description 类描述
 * @Author lishuang234
 * @Date 2024/11/7 4:18 PM
 **/
@Service
@Slf4j
public class TestService {

    public void printTag(){

        log.info("天气真热啊");
        log.error("天气真热啊");
    }
}
