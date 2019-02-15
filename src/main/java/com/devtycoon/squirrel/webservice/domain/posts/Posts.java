package com.devtycoon.squirrel.webservice.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 접근권한을 protected
@Getter // Lombok 입니당
@Entity // 라벨. 맵핑할 Object라는걸 식별함
public class Posts {
    @Id // 프라이머리 키를 가져오는 것
    @GeneratedValue(strategy = GenerationType.AUTO) // 기본값이 AUTO. id를 설정하면 id로 되지만 설정하지 않으면 자동으로 증가하게 한다.
    private  Long id; // id, GeneratedValue 어노테이션을 붙인거임

    @Column(length = 500, nullable = false) // 매핑이 되는 애 - lenght는 최대 길이, nullable false == not null
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false) // 테이블의 칼럼의 속성을 TEXT로 설정
    private String content;

    // 기본값으로 Column이 들어감. 속성을 넣고 싶을 때는 @Column(속성)
    private String author;

    // 생성자 만드는 단축키 -> Alt + Insert
    @Builder // 나중에 설명함
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
