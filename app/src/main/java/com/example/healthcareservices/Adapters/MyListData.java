package com.example.healthcareservices.Adapters;

public class MyListData {

    private String description;
    private int imgId;
    private String text2;
    public MyListData(String description,String text2, int imgId) {
        this.description = description;
        this.imgId = imgId;
        this.text2 = text2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}
