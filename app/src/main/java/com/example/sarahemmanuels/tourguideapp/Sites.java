package com.example.sarahemmanuels.tourguideapp;

public class Sites {
    private String mName;
    private String mDetails;
    private int mImageId;

    public Sites(String name, String details, int imageId){
        mName = name;
        mDetails = details;
        mImageId = imageId;
    }

    public String getName(){
        return mName;
    }

    public String getDetails(){
        return mDetails;
    }

    public int getImageId() { return mImageId; }

}
