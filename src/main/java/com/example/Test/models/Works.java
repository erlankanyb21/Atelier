package com.example.Test.models;

import javax.persistence.*;

@Entity
public class Works {
    @Id
    @SequenceGenerator(name = "works_sequence", sequenceName = "works_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "works_sequence")
    private Long id;
    private String name;
    private String imgUrl;

    public Works() {
    }

    public Works(String name, String imgUrl) {
        this.name = name;
        this.imgUrl = imgUrl;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImgUrl(String images) {
        this.imgUrl = images;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imgUrl=" + imgUrl +
                '}';
    }
}
