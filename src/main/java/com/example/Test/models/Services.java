package com.example.Test.models;

import javax.persistence.*;

@Entity
public class Services {

    @Id
    @SequenceGenerator(name = "works_sequence", sequenceName = "works_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "works_sequence")
    private Long id;
    private String image;
    private String title;
    private String description;

    public Services() {
    }

    public Services(Long id, String image, String title, String description) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
