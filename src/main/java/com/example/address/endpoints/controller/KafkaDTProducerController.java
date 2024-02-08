//package com.example.address.endpoints.controller;
//
//import com.example.content.kafka.DTProducer;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("producer")
//public class KafkaDTProducerController {
//
//    DTProducer dtProducer;
//
//    public KafkaDTProducerController(DTProducer dtProducer) {
//        this.dtProducer = dtProducer;
//    }
//
//@PostMapping("/send")
//    public void sendMessage( @RequestBody String msg){
//
//        dtProducer.sendMessage(msg);
//    }
//
//
//}
