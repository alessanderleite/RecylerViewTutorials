package com.example.alessander.recylerviewjson;

public class ExampleItem {
    private String mImageUrl;
    private String mCreator;
    private int mLikes;

    public ExampleItem(String imageUrl, String creator, int likes) {
        this.mImageUrl = imageUrl;
        this.mCreator = creator;
        this.mLikes = likes;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreator() {
        return mCreator;
    }

    public int getLikesCount() {
        return mLikes;
    }
}
