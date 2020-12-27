package com.xpwi.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "author")
public class Config {
    private  String name;

    private  String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String csdnUrl) {
        this.url = csdnUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
