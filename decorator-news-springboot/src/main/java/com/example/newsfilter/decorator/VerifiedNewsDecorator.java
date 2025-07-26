package com.example.newsfilter.decorator;

public class VerifiedNewsDecorator extends NewsDecorator {
    public VerifiedNewsDecorator(NewsSource source) {
        super(source);
    }

    @Override
    public String getNews() {
        return "[Verified] " + source.getNews();
    }
}
