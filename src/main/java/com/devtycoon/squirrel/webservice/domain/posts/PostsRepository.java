package com.devtycoon.squirrel.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> { // Posts -> 가져올 도메인, Long -> 기본값의 타입
}

// DAO의 기본 설정을 요기서 다 해줌!

// Ctrl + Shift + A -> Test -> OK