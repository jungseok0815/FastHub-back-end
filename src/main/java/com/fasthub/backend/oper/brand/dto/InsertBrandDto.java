package com.fasthub.backend.oper.brand.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class InsertBrandDto {
    private String brandNm;
    private String brandNum;
    private String brandLocation;
    private String brandDc;
    private String brandImg;
}
