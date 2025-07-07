package com.ecomm2.ecommerceapp.Controllers;

import com.ecomm2.ecommerceapp.Dto.ProductDto;
import com.ecomm2.ecommerceapp.Service.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RequestMapping("/api/products")
@RestController
public class ProductController {
    private final IProductService ProductService;

    public ProductController(IProductService productService) {
        ProductService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) throws Exception {
        ProductDto response=this.ProductService.getProductByID(id);

        return ResponseEntity.ok(response);
    }
    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto){
        // This method is not implemented in the original code, but you can add logic to create a product.
        // For now, we will return a placeholder response.
        return ResponseEntity.ok(ProductService.createProduct(productDto));
    }

}
