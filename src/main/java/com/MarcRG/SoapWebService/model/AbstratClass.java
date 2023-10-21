package com.MarcRG.SoapWebService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@Table(name = "AbstractEntity")
@EntityListeners(AuditingEntityListener.class)
public class AbstratClass implements Serializable {
    @CreatedDate
    @Column(name = "CreationDate",nullable = false,updatable = false)
    private Instant CreationDate;

    @LastModifiedDate
    @Column(name = "LastUpdateDate")
    private Instant LastUpdateDate;
}
