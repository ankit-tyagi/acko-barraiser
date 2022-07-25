package com.acko.newsLetter.Model;

import com.acko.newsLetter.views.NewsLettersView;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;

@Entity
public class NewsLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonView(NewsLettersView.class)
    private Long id;

    @JsonView(NewsLettersView.class)
    @Column(name = "title")
    private String title;

    @JsonView(NewsLettersView.class)
    @Column(name = "price")
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private Category category;

}
