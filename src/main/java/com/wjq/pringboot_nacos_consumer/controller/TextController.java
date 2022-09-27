package com.wjq.pringboot_nacos_consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TextController {
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value ="/echos",method = RequestMethod.GET)
    public String echo(){
        return restTemplate.getForObject("http://service-provider/echo/mxb",String.class);
    }

}
