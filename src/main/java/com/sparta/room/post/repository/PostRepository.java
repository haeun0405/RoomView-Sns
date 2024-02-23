package com.sparta.room.post.repository;

import com.sparta.room.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
//테스트
}
