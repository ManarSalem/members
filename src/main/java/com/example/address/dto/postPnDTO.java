package com.example.address.dto;


import lombok.*;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class postPnDTO {
    private String systemId;
    private String messageId;
    private String serviceId;
    private String language;
    private String message;
    private String subject;
    private String officialId;
    private String idType;
    private String hwId;
    private String deeplink;
    private String notificationType;
    private String attachment;
    private String mediaURL;
    private String imageURL;
    private String sound;
    private String expiryTimeStamp;
    private String scheduleDeliveryTime;
}
