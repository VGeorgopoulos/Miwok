package com.example.android.miwok;

/**
 * Created by neuromancer on 14/11/2016.
 */

public class Word {


    /**
     * represents a vocabulary word that the user wants to learn.
     * It contains a default translation and a Miwok translation for the word.
     */

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * @param miwokTranslation
     * @param defaultTranslation
     */
    public Word(String miwokTranslation, String defaultTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    /**
     * @param imageResourceId
     * @param miwokTranslation   Parameter for the Miwok language
     * @param defaultTranslation
     */
    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getMiwokTranslation() {

        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
