package com.example.demo.proglang;

import javax.persistence.*;

@Entity
@Table
public class ProgLang {

    @Id
    @SequenceGenerator(
            name = "proglang_sequence",
            sequenceName = "proglang_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "proglang_sequence"
    )
    private Long id;
    private String langName;
    private int review;

    public ProgLang() {
    }

    public ProgLang(Long id, String langName, int review) {
        this.id = id;
        this.langName = langName;
        this.review = review;
    }

    public ProgLang(String langName, int review) {
        this.langName = langName;
        this.review = review;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "ProgLang{" +
                "id=" + id +
                ", langName='" + langName + '\'' +
                ", review=" + review +
                '}';
    }
}
