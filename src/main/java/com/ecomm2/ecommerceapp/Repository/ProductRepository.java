package com.ecomm2.ecommerceapp.Repository;

import com.ecomm2.ecommerceapp.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    // Additional query methods can be defined here if needed
}
