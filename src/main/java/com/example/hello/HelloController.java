package com.example.hello;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

@RestController
public class HelloController {

    @Value("${endpoint.url}")
    private String url;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/env")
    public String env() throws IOException {
        Document doc = Jsoup.connect(url).get();
        return doc.select("h1").text();
    }
}
