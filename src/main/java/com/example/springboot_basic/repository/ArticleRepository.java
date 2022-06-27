package com.example.springboot_basic.repository;

import com.example.springboot_basic.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> { // 대상이되는 Entity, 대표값 타입 지정

}
