package com.osleyder.inmueble.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="inmueble")
public class Inmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", length=150, nullable=false)
    private String name;

    @Column(name="address", length=500, nullable=false)
    private String address;

    @Column(name="picture", length=1200)
    private String picture;

    @Column(name="price", nullable=false)
    private BigDecimal price;

    @Column(name="creation_date", nullable=false)
    private LocalDateTime creationDate;
}
