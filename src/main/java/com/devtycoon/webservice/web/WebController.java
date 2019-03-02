package com.devtycoon.webservice.web;

import com.devtycoon.webservice.domain.posts.PostsRepository;
import com.devtycoon.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {
    private PostsService postsService;

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "main"; // 스프링이 알아서 파일명을 따라 찾아줌
    }
}
