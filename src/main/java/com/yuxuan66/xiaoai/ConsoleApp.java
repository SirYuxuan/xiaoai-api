package com.yuxuan66.xiaoai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Sir丶雨轩
 * @since 2022/4/21
 */
@SpringBootApplication(scanBasePackages = {"cn.hutool.extra.spring","com.yuxuan66"})
public class ConsoleApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsoleApp.class,args);
    }
}
