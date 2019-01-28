package com.frogermcs.mnist;

public class Classification {
    public final String title;
    public final float confidence;

    public Classification(String title, float confidence) {
        this.title = title;
        this.confidence = confidence;
    }

    @Override
    public String toString() {
        return title + " " + String.format("(%.1f%%) ", confidence * 100.0f);
    }
}
