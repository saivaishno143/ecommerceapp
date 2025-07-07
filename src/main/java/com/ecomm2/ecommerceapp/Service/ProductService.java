package com.ecomm2.ecommerceapp.Service;

import com.ecomm2.ecommerceapp.Dto.ProductDto;
import com.ecomm2.ecommerceapp.Entity.ProductEntity;
import com.ecomm2.ecommerceapp.Mappers.ProductMapper;
import com.ecomm2.ecommerceapp.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDto getProductByID(Long id) throws Exception {
        return productRepository.findById(id)
                .map(ProductMapper::toDto)
                .orElseThrow(() -> new Exception("Product not Found"));
    }

    @Override
    public ProductDto createProduct(ProductDto dto) {
        ProductEntity saved= productRepository.save(ProductMapper.toEntity(dto));
        return ProductMapper.toDto(saved);
    }
}
