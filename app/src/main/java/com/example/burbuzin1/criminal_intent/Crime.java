package com.example.burbuzin1.criminal_intent;

import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    public Crime() {
        mId = UUID.randomUUID();
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
