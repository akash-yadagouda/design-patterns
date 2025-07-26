package com.example.newsfilter.decorator;

public class RegionFilterDecorator extends NewsDecorator {
    private final String region;

    public RegionFilterDecorator(NewsSource source, String region) {
        super(source);
        this.region = region;
    }

    @Override
    public String getNews() {
        return source.getNews() + " [Region Filter: " + region + "]";
    }
}
