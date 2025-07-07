package com.ecomm2.ecommerceapp.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

import static java.time.Instant.now;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Setter
@Getter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Column( nullable = false, updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private Instant updatedAt;

    //this method is called before the entity is saved to the database for the first time
    @PrePersist
    protected void onCreate() {
        this.createdAt = now();
        this.updatedAt = now();
    }
    @PreUpdate
    protected void update(){
        this.updatedAt = now();
    }
}
