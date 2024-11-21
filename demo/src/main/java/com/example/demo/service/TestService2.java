package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
public class TestService2 {

    public void printTag(){

        log.info("天气真热啊2");
        log.error("天气真热啊2");
    }
}
