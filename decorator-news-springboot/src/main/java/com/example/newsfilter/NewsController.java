package com.example.newsfilter;

import com.example.newsfilter.decorator.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @GetMapping("/news")
    public String getFilteredNews(@RequestParam(defaultValue = "global") String region) {
        NewsSource news = new BasicNewsSource();
        news = new VerifiedNewsDecorator(news);
        news = new RegionFilterDecorator(news, region);
        return news.getNews();
    }
}
