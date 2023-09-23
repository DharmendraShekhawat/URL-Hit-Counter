package com.dharmendra.URL_hit_counter.controller;

import com.dharmendra.URL_hit_counter.model.User;
import com.dharmendra.URL_hit_counter.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class urlHitController {
@Autowired
URLService urlService;
@PostMapping("url")
    public String urlHit(@RequestBody User user){

         return urlService.addUser(user);
    }

    @GetMapping("url/count")
    public Integer getUrlHit(){

        return urlService.getUrlHit();
    }

    @GetMapping("url/count/userName/{myName}")
    public Integer getUrlHit(@PathVariable String myName){

        return urlService.getUrlHitByName(myName);
    }

}
