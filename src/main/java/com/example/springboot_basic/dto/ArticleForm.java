package com.example.springboot_basic.dto;

import com.example.springboot_basic.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {

    private String title;
    private String content;

    public Article toEntity() {
        return new Article(null, title, content);
    }


//    public ArticleForm(String title, String content) {// @AllArgsConstructor
//        this.title = title;
//        this.content = content;
//    }
//
//    @Override
//    public String toString() {// @ToString
//        return "ArticleForm{" +
//                "title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }

}
