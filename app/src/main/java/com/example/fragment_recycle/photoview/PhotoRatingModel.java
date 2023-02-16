package com.example.fragment_recycle.photoview;

public class PhotoRatingModel {
    private String title, imgUrl;
    private Integer rating;

    public PhotoRatingModel(String title, String imgUrl, Integer rating) {
        this.title = title;
        this.imgUrl = imgUrl;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Integer getRating() {
        return rating;
    }
}
