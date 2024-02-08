package com.example.address.dto;

public record Status(String status, String reasonCode, String reasonDesc, String nativeReasonCode,
                     String nativeReasonDesc) {
}
