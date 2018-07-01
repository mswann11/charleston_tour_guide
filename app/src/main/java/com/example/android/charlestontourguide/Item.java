package com.example.android.charlestontourguide;

public class Item {
    private String mName;
    private String mAddress;
    private String mPhone;
    private String mWebsite;
    private int mImageResourceId;
    private String mMoreInfo;

    public Item(String name, String address, String phone, String website, int imageResourceId, String moreInfo) {
        mName = name;
        mAddress = address;
        mPhone = phone;
        mWebsite = website;
        mImageResourceId = imageResourceId;
        mMoreInfo = moreInfo;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getMoreInfo() {
        return mMoreInfo;
    }
}
