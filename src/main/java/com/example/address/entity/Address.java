package com.example.address.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Address {

    private String city;
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
    private Integer dtMemberId;
}
