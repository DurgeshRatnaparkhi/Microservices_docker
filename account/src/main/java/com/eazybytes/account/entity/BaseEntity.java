package com.eazybytes.account.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class) // this annotation is used to specify that the entity should be audited by the AuditingEntityListener class, which is responsible for automatically populating the auditing fields (createdAt, createdBy, updatedAt, updatedBy) when the entity is persisted or updated.
public class BaseEntity {

    @CreatedDate // this annotation is used to automatically populate the createdAt field with the current date and time when the entity is first persisted.
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @CreatedBy// it is used to populate the createdBy field with the user who created the entity when it is first persisted.
    @Column(updatable = false)
    private String createdBy;

    @LastModifiedDate // this annotation is used to automatically populate the updatedAt field with the current date and time whenever the entity is updated.
    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @LastModifiedBy // it is used to populate the updatedBy field with the user who last modified the entity whenever it is updated.
    @Column(insertable = false)
    private String updatedBy;
}
