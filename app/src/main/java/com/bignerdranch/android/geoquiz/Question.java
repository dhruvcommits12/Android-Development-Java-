package com.bignerdranch.android.geoquiz;

public class Question {
    private int mTextResId;
    //will hold a resource ID of a string resource for the question
    private boolean mAnswerTrue;
    public Question(int textResId, boolean answerTrue){  //constructor
        mTextResId=textResId;
        mAnswerTrue=answerTrue;
    }

}
