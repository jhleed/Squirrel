package com.devtycoon.squirrel.webservice.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup(){
//        postsRepository.deleteAll();
    }

    @Test
    public  void 게시글저장_불러오기(){
        //given
//        Posts entity = Posts.builder()
//                .title("테스트 게시글")
//                .content("테스트 본문")
//                .author("seon_and_young@naver.com")
//                .build();
//        postsRepository.save(entity
//        );

        // 아래의 값들을 가진 객체를 생성
        postsRepository.save(Posts.builder()
                .title("테스트 게시글")
                .content("테스트 본문")
                .author("seon_and_young@naver.com")
                .build()
        );

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle(), is("테스트 게시글"));
        assertThat(posts.getContent(), is("테스트 본문"));

    }
}

// 현재 위치 알기 : Alt + F1 -> Project View