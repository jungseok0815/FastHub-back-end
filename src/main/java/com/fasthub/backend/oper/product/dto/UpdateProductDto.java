package com.fasthub.backend.oper.product.dto;

import com.fasthub.backend.cmm.enums.ProductCategory;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class UpdateProductDto {
    private Long id;
    private String productNm;
    private String productCode;
    private int productPrice;
    private int productQuantity;
    private String productBrand;
    private ProductCategory category;
    private List<MultipartFile> image;
}
