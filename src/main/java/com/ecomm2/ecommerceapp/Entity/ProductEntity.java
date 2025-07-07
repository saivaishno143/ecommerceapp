package com.ecomm2.ecommerceapp.Entity;


import lombok.*;
import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductEntity extends BaseEntity {
    private String image;
    private String color;
    private int price;
    private String description;
    private int discount;
    private String model;
    private Long id;
    private String title;
    private String category;
    private String brand;
    private boolean popular;
}
