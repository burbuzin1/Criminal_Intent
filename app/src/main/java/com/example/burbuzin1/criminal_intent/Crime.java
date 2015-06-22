package com.example.burbuzin1.criminal_intent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private Date mDate;
    private boolean mSolved;

    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
      mSolved = solved;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
      mTitle = title;
    }
}
