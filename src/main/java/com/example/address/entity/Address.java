package com.example.address.entity;

import jakarta.persistence.Entity;
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
//    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private Integer id;
    private Integer dtMemberId;
}
