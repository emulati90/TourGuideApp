package com.example.sarahemmanuels.tourguideapp;

public class SiteInfo {
    private String mDescription;
    private String mEntryFees;
    private String mTime;

    public SiteInfo(String description, String entryFees, String time){
        mDescription = description;
        mEntryFees = entryFees;
        mTime = time;
    }

    public String getDescription(){
        return mDescription;
    }

    public String getEntryFees(){
        return mEntryFees;
    }

    public String getTime() { return mTime; }
}
