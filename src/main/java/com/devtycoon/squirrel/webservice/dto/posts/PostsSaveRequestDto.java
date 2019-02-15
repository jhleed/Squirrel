package com.devtycoon.squirrel.webservice.dto.posts;

import com.devtycoon.squirrel.webservice.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter // private이기 때문에 접근을 하지 못해서 여기서 해주어야하기 때문에 Setter를 씀
@NoArgsConstructor
public class PostsSaveRequestDto {

    // DTO : 사용자한테 보여주는 뷰

    private  String title;
    private  String content;
    private  String author;

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}

// 사용자의 뷰에 노출되거나 뷰에서 들어오는 부분이기 때문에 철저하게 분리를 해서 사용을 함