package com.example.urlconverter.service.mapper;

import com.example.urlconverter.dto.request.UrlRequestDto;
import com.example.urlconverter.dto.response.UrlResponseDto;
import com.example.urlconverter.model.Url;
import org.springframework.stereotype.Service;

@Service
public class UrlMapper implements RequestDtoMapper<UrlRequestDto, Url>,
         ResponseDtoMapper<UrlResponseDto, Url> {

    @Override
    public Url mapToModel(UrlRequestDto dto) {
        Url url = new Url();
        url.setUrlFull(dto.getUrlFull());
        return null;
    }

    @Override
    public UrlResponseDto mapToDto(Url url) {
        UrlResponseDto urlResponseDto = new UrlResponseDto();
        urlResponseDto.setUrlShort(url.getUrlShort());
        return urlResponseDto;
    }
}

