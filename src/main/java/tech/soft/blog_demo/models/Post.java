package tech.soft.blog_demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
    // id autoincrement для таблицы, содержащей статьи блога
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, annonce, fullText;
    private Integer views;

    public Post() {
    }

    public Post(String title, String annonce, String fullText) {
        this.title = title;
        this.annonce = annonce;
        this.fullText = fullText;
        this.views = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnnonce() {
        return annonce;
    }

    public void setAnnonce(String annonce) {
        this.annonce = annonce;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

}

