package com.leo.consumer.controller;

import com.leo.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User queryById(@PathVariable Long id){
        String url = "http://localhost:9090/user/"+id;
        return restTemplate.getForObject(url, User.class);
    }


}
