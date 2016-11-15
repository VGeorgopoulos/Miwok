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

    public Word(String miwokTranslation, String defaultTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
