package com.example.fragment_recycle.cardview;

public class CardModel {
    private String title;
    private String description;
    private Boolean isFavorite;

    public CardModel(String title, String description, Boolean isFavorite) {
        this.title = title;
        this.description = description;
        this.isFavorite = isFavorite;
    }
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }
}
