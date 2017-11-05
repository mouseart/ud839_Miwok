package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image ID for the word */
    private int mImageID;

    private boolean mhasImage = false;

    /** sound ID for the word */
    private int mSoundID;



    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,int soundID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageID = imageResourceId;
        mSoundID = soundID;
        mhasImage = true;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {

        return mMiwokTranslation;
    }

    public int getIimageResourceId() {
        return mImageID;
    }

    public Word(String defaultTranslation,String miwokTranslation,int soundID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mSoundID = soundID;

    }

    public boolean getHasImage(){
        return mhasImage;
    }

    public int getSoundID(){ return mSoundID;}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageID=" + mImageID +
                ", mhasImage=" + mhasImage +
                ", mSoundID=" + mSoundID +
                '}';
    }
}
