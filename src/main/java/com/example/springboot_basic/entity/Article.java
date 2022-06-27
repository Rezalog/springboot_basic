package com.example.springboot_basic.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // DB가 해당 객체를 인식가능
@AllArgsConstructor
@ToString
public class Article {

    @Id // 대표값을 지정, 주민등록번호와 비슷
    @GeneratedValue // 1, 2, 3, ... 자동생 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

//    public Article(Long id, String title, String content) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//    }
//
//    @Override
//    public String toString() {
//        return "Article{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }
}
