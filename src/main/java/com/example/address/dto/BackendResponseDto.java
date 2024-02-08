package com.example.address.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@Builder
@Setter
public class BackendResponseDto {

    private int httpStatus;
    private String status;
    private String reasonCode;
    private String reasonDescription;
    private String nativeReasonCode;
    private String NativeReasonDescription;



}
