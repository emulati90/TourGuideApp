package com.example.sarahemmanuels.tourguideapp;

public class City {

    private String mCity;
    private String mSiteOne;
    private String mSiteTwo;

    public City(String city, String siteOne, String siteTwo){
        mCity = city;
        mSiteOne = siteOne;
        mSiteTwo = siteTwo;
    }

    public String getCity(){
        return mCity;
    }

    public String getSiteOne(){
        return mSiteOne;
    }

    public String getSiteTwo(){
        return mSiteTwo;
    }

}
