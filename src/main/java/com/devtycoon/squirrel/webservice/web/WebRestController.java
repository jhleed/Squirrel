package com.devtycoon.squirrel.webservice.web;

import com.devtycoon.squirrel.webservice.domain.posts.Posts;
import com.devtycoon.squirrel.webservice.domain.posts.PostsRepository;
import com.devtycoon.squirrel.webservice.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 서버가 켜지고 사용자로부터 요청이 왔을 때 Controller 어노테이션이 있는 class를 먼저 들어감
@AllArgsConstructor
// 스프링에 의존성 주입을 해주는 역할
public class WebRestController {

    private PostsRepository postsRepository; // new는 스프링에서 해줌 ( 의존성 주입 ) -> IOC

    @GetMapping("/hello") // GET으로 날러온 메소드만 매핑함
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts") // BODY가 있음, 생성할 때 사용, POST로 날라온 메소드만 매핑
    public void savePosts(@RequestBody PostsSaveRequestDto dto){ // json을 매핑을 받아서 쓰는 것
        Posts entity = dto.toEntity();
        postsRepository.save(entity);
    }
    // @RequestBody json으로 들어온 리퀘스트 바디를 매핑 시키겠다 ( PostsSaveRequestDto dto <- 요 파라미터한테 )

}
