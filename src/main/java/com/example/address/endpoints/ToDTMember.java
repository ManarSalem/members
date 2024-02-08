package com.example.address.endpoints;

import com.example.address.dto.AddressDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/to")
@AllArgsConstructor
@Slf4j
public class ToDTMember {

 private WebClient webClient;
@PostMapping("/dt")
    public String toDTMemberAPI(){

        AddressDTO addressDTO= new AddressDTO(1,"abha",1);
     Mono<ResponseEntity<String>> returnedRespinse=
             webClient.post().uri("").bodyValue(addressDTO)
                .retrieve()
                .toEntity(String.class);
     returnedRespinse.subscribe(response ->{
        log.info("respinse from dtmember"+ response.getBody());
         log.info("sucess");
     }, error->{
         log.error("respinse "+error.getMessage());
         log.error("failed");
     });
return "end";


    }
}
