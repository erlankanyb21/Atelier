package com.example.Test.models;

import javax.persistence.*;

@Entity
public class About {
    @Id
    @SequenceGenerator(name = "about_sequence", sequenceName = "about_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "about_sequence")
    private Long id;
    private String title;
    private String imgUrl;
    private String description;

    public About() {
    }

    public About(String title, String imgUrl, String description) {
        this.title = title;
        this.imgUrl = imgUrl;
        this.description = description;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", description=" + description +
                '}';
    }
}
