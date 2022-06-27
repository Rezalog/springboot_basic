package com.example.springboot_basic.controller;

import com.example.springboot_basic.dto.ArticleForm;
import com.example.springboot_basic.entity.Article;
import com.example.springboot_basic.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ArticleController {

    @Autowired // 스프링 부트가 이미 생성해놓은 객체를 가져다가 자동으로 연결(즉, 따로 new 로 인스턴스 생성해서 변수바인딩 할 필요 없다)
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        log.info(form.toString());
//        System.out.println(form.toString()); -> 로깅 기능으로 대체(Slf4j)

        // JPA 이용하여 dto를 DB에 저장하기
        // 1. DTO 객체를 Entity로 변환
        Article article = form.toEntity();
        log.info(article.toString());
//        System.out.println(article.toString());

        // 2. repository 가 Entity를 DB에 저장
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
//        System.out.println(saved.toString());

        return "";
    }
}
