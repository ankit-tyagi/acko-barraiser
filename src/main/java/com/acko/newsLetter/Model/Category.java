package com.acko.newsLetter.Model;

import com.acko.newsLetter.views.CategoryView;
import com.acko.newsLetter.views.NewsLettersView;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonProperty()
    private Long id;

    @Column(name = "category")
    @JsonView(CategoryView.class)
    private String category;

    @OneToMany(mappedBy = "category")
    @JsonView(CategoryView.class)
    private Set<NewsLetter> newsLetter;
}