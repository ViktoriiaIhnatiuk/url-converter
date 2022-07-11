package com.example.urlconverter.service.impl;

import com.example.urlconverter.model.Url;
import com.example.urlconverter.repository.UrlRepository;
import com.example.urlconverter.service.UrlService;
import org.springframework.stereotype.Service;

@Service
public class UrlServiceImpl implements UrlService {
    private final UrlRepository urlRepository;

    public UrlServiceImpl(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    @Override
    public Url save(Url url) {
        return urlRepository.save(url);
    }

    @Override
    public String convertUrl(String url) {
        StringBuilder builder = new StringBuilder();
        return builder.append(getBaseFromUrl(url))
                .append(getShortUrl(url)).toString();
    }

    static String getBaseFromUrl(String url) {
        String[] urlParts = url.split("/");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            builder.append(urlParts[i]).append("/");
        }
        return builder.toString();
    }

    static String getShortUrl(String url) {
        char[] map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int hash = Math.abs(url.hashCode() + 31);
        StringBuffer shorturl = new StringBuffer();
        while (hash > 0) {
            shorturl.append(map[hash % 62]);
            hash = hash / 62;
        }
        return shorturl.reverse().toString();
    }
}
