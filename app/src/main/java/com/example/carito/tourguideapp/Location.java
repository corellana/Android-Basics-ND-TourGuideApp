package com.example.carito.tourguideapp;

/**
 * {@link Location} represents a touristic place in Santiago, Chile.
 */

public class Location {

    /**
     * Name of the location
     */
    private String mLocationName;

    /**
     * Image Resource ID for the location
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * CONSTRUCTOR
     */

    /**
     * Create a new Location object.
     *
     * @param locationName is the name of a place/location
     * @param imageResourceId   is the drawable resource ID for the image asset.
     */
    public Location(String locationName, int imageResourceId) {
        mLocationName = locationName;
        this.mImageResourceId = imageResourceId;
    }
    /**
     * METHODS
     */

    /**
     * Get the location name of a place.
     */
    public String getLocationName() {
        return mLocationName;
    }

    /**
     * Get the image of the location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this location.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

