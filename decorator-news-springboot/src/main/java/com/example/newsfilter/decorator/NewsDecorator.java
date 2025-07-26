package com.example.newsfilter.decorator;

public abstract class NewsDecorator implements NewsSource {
    protected NewsSource source;

    public NewsDecorator(NewsSource source) {
        this.source = source;
    }

    public abstract String getNews();
}
