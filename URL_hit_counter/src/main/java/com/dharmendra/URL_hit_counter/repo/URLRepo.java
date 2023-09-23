package com.dharmendra.URL_hit_counter.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class URLRepo {

    @Autowired
    Map<String , Integer> userMap;


    public  Map<String, Integer> getMap() {

        return userMap;
    }
}
