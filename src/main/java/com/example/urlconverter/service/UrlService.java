package com.example.urlconverter.service;

import com.example.urlconverter.model.Url;

public interface UrlService {
    Url save(Url url);

    String convertUrl(String url);
}
