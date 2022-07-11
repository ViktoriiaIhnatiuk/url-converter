package com.example.urlconverter.controller;

import com.example.urlconverter.dto.request.UrlRequestDto;
import com.example.urlconverter.model.Url;
import com.example.urlconverter.service.UrlService;
import com.example.urlconverter.service.mapper.UrlMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConverterController {
    private final UrlService urlService;
    private final UrlMapper urlMapper;

    public ConverterController(UrlService urlService, UrlMapper urlMapper) {
        this.urlService = urlService;
        this.urlMapper = urlMapper;
    }

    @GetMapping("/converter")
    public String converterForm(Model model) {
        model.addAttribute("converter", new UrlRequestDto());
        return "converter";
    }

    @PostMapping("/converter")
    public String converterSubmit(@ModelAttribute Url url, UrlRequestDto urlRequestDto) {
        url.setUrlFull(urlRequestDto.getUrlFull());
        url.setUrlShort(urlService.convertUrl(urlRequestDto.getUrlFull()));
        urlMapper.mapToDto(urlService.save(url));
        return "result";
    }
}
