package com.example.rcv_firebase;

public class Messages {

    String name;
    String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Messages(){
        this.name = name;
        this.imageUrl = imageUrl;
    }
}
