package com.example.android.mytour;

public class Ride {
    private String mRide;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */

    private static final int NO_IMAGE_PROVIDED = -1;


    public Ride(String ride, String description, int imageResourceId){
        mRide = ride;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getRide() { return mRide; }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
