package com.example.demo.service;

import com.example.demo.domain.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface PostService {

    //등록
    Post save(Post post);
    //전체 가져오기
    List<Post>  findAll();
    // 기본키로 읽기
    Post findbyId( long id);
    //수정
    Post update(long id, Post post);
    //데이터 물리 삭제
     void delete(long id);
    // 테이터 논리 삭제
    Post softdelete(long id);
    //페이징 리스트
    Page<Post> getPostList(Pageable pageable);




}
