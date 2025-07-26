package com.example.newsfilter.decorator;

public class BasicNewsSource implements NewsSource {
    @Override
    public String getNews() {
        return "Breaking Global News: Climate change impact worsens...";
    }
}
