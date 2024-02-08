package com.example.address.endpoints;

import com.example.address.dto.*;
import com.example.address.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("address")
@Slf4j
public class AddressControllerInactive {
    private static final String TRANSACTION_ID = "Transaction ID: ";
    private static final String TRANSACTION_STATUS = "Transaction Status: ";

    AddressService addressService;

    @Autowired
    public AddressControllerInactive(AddressService addressService) {
        this.addressService = addressService;
    }







    @PostMapping("/post2/{id}")
    public ResponseEntity postTest2(@PathVariable int id){
        return ResponseEntity.internalServerError().build();
    }

    @PostMapping("/post3/{id}")
    public ResponseEntity<BackendResponseDto> postTest3(@PathVariable int id,  @RequestBody String post) throws InterruptedException {
        log.info("recived data {}",post);
        HttpStatusCode status= HttpStatusCode.valueOf(500);

        if(id==1){
             status= HttpStatusCode.valueOf(400);
        }
        if(id==2)
            status=HttpStatusCode.valueOf(200);

        BackendResponseDto backendResponseDto= BackendResponseDto.builder()
                .nativeReasonCode("200")
                .httpStatus(200)
                .reasonDescription("no reason")
                .status("success")
                .NativeReasonDescription("no desc")
                .reasonCode("200")
                .build();
       // Thread.sleep(120000);
        return new ResponseEntity<>(backendResponseDto,status);
    }





    private static Response mockSuccessResponse() {
        Status status = new Status("SUCCESS", "SUCCESS", "Operation successful", "100", "Success code 100");

        Response response = new Response("1", status);

//        log.info("recived data {}",post);
        log.info(TRANSACTION_ID + response.transId());
        log.info(TRANSACTION_STATUS + response.status().status());
        return response;
    }
    @PostMapping("/SuccessResponse")
    public ResponseEntity<Response> getSuccessResponse() {

        Response response = mockSuccessResponse();

        return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(response);
    }

}

