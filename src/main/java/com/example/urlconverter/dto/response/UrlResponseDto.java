package com.example.urlconverter.dto.response;

public class UrlResponseDto {
    private String urlShort;

    public UrlResponseDto() {
    }

    public String getUrlShort() {
        return urlShort;
    }

    public void setUrlShort(String urlShort) {
        this.urlShort = urlShort;
    }

    @Override
    public String toString() {
        return "Url{"
                + ", urlShort='" + urlShort + '\''
                + '}';
    }
}
