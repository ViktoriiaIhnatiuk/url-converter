package com.example.urlconverter.dto.request;

import java.util.Objects;

public class UrlRequestDto {
    private String urlFull;

    public UrlRequestDto() {
    }


    public String getUrlFull() {
        return urlFull;
    }

    public void setUrlFull(String urlFull) {
        this.urlFull = urlFull;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UrlRequestDto that = (UrlRequestDto) o;
        return urlFull.equals(that.urlFull);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urlFull);
    }

    @Override
    public String toString() {
        return "Url{"
                + ", urlFull='" + urlFull + '\''
                + '}';
    }
}
