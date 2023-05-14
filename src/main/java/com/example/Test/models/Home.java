package com.example.Test.models;

import javax.persistence.*;

@Entity
public class Home {

    @Id
    @SequenceGenerator(name = "works_sequence", sequenceName = "works_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "works_sequence")
    private Long id;
    private String ctaTitle;
    private String ctaDescription;
    private String servicesTitle;

    public Home() {
    }

    public Home(Long id, String ctaTitle, String ctaDescription, String servicesTitle) {
        this.id = id;
        this.ctaTitle = ctaTitle;
        this.ctaDescription = ctaDescription;
        this.servicesTitle = servicesTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCtaTitle() {
        return ctaTitle;
    }

    public void setCtaTitle(String ctaTitle) {
        this.ctaTitle = ctaTitle;
    }

    public String getCtaDescription() {
        return ctaDescription;
    }

    public void setCtaDescription(String ctaDescription) {
        this.ctaDescription = ctaDescription;
    }

    public String getServicesTitle() {
        return servicesTitle;
    }

    public void setServicesTitle(String servicesTitle) {
        this.servicesTitle = servicesTitle;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                "ctaTitle=" + ctaTitle +
                "ctaDescription=" + ctaDescription +
                "servicesTitle=" + servicesTitle +
                '}';
    }
}
