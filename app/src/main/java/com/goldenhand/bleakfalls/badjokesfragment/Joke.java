package com.goldenhand.bleakfalls.badjokesfragment;

import java.io.Serializable;

/**
 * Created by S9925872A on 3/3/2015.
 */
public class Joke implements Serializable {
    String mQuestion;
    String mAnswer;
    boolean mClicked;

    public Joke(String question, String answer) {
        mQuestion = question;
        mAnswer = answer;
        mClicked = false;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        this.mQuestion = question;
    }

    public String getAnswer() {
        return mAnswer;
    }

    public void setAnswer(String answer) {
        this.mAnswer = answer;
    }

    public boolean getClicked() {
        return mClicked;
    }

    public void setClicked(boolean clicked) {
        this.mClicked = clicked;
    }
}
