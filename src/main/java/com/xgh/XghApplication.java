package com.xgh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@MapperScan("com.xgh.repository")*/
public class XghApplication {

    public static void main(String[] args) {
        SpringApplication.run(XghApplication.class, args);
    }

}
