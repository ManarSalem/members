package com.example.address.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AddressDTO {

    private Integer id;
    private String city;
    private Integer dtMemberId;
}
