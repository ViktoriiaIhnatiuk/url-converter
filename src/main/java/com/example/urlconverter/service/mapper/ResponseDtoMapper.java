package com.example.urlconverter.service.mapper;

public interface ResponseDtoMapper<D, T> {
    D mapToDto(T t);
}
