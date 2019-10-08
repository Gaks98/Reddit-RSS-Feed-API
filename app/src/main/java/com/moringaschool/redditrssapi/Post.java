package com.moringaschool.redditrssapi;

public class Post {
    private String title;
    private String author;
    private String date_updated;
    private String postURL;
    private String thumbnailURL;

    public Post(String title, String author, String date_updated, String postURL, String thumbnailURL) {
        this.title = title;
        this.author = author;
        this.date_updated = date_updated;
        this.postURL = postURL;
        this.thumbnailURL = thumbnailURL;
    }
}
