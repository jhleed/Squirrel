package com.devtycoon.squirrel.webservice.web;

import com.devtycoon.squirrel.webservice.domain.posts.PostsRepository;
import com.devtycoon.squirrel.webservice.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){ // json을 매핑을 받아서 쓰는 것
        postsRepository.save(dto.toEntity());
    }

}
