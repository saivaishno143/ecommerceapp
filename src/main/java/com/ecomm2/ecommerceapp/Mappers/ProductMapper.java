package com.ecomm2.ecommerceapp.Mappers;

import com.ecomm2.ecommerceapp.Dto.ProductDto;
import com.ecomm2.ecommerceapp.Entity.ProductEntity;

public class ProductMapper {

    public static ProductDto toDto(ProductEntity product){
        return  ProductDto.builder().
                id((long) product.getId())
                .image(product.getImage())
                .color(product.getColor())
                .price(product.getPrice())
                .description(product.getDescription())
                .discount(product.getDiscount())
                .model(product.getModel())
                .title(product.getTitle())
                .category(product.getCategory())
                .brand(product.getBrand())
                .popular(product.isPopular())
                .build();
    }
    public static ProductEntity toEntity(ProductDto dto){
        return ProductEntity.builder().
                image(dto.getImage())
                .color(dto.getColor())
                .price(dto.getPrice())
                .description(dto.getDescription())
                .discount(dto.getDiscount())
                .model(dto.getModel())
                .title(dto.getTitle())
                .category(dto.getCategory())
                .brand(dto.getBrand())
                .popular(dto.isPopular())
                .build();
    }


}
