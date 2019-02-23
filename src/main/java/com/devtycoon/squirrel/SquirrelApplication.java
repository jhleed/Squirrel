package com.devtycoon.squirrel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SquirrelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SquirrelApplication.class, args);
    }

}

// 여기가 시작점
// 서버를 띄우는 역할을 함 ( + 환경설정도 해줌 )
// -> 그 일들을 하는게 @SpringBootApplication 어노테이션이다.
