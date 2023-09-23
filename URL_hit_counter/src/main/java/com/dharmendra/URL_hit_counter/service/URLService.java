package com.dharmendra.URL_hit_counter.service;

import com.dharmendra.URL_hit_counter.model.User;
import com.dharmendra.URL_hit_counter.repo.URLRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class URLService {

    @Autowired
URLRepo urlRepo;
    public String addUser(User user) {
      String name =  user.getUserName();

      Integer oldCount = urlRepo.getMap().getOrDefault(name, 0);
      urlRepo.getMap().put(name, oldCount+1);
      return "url hitted";
    }


    public Integer getUrlHit() {
        Integer totalHit = 0;

        for(String name : urlRepo.getMap().keySet()){
            totalHit += urlRepo.getMap().get(name);
        }
        return totalHit;
    }

    public Integer getUrlHitByName(String myName) {
        Integer count = 0;

        for(String name :  urlRepo.getMap().keySet()){
            if(myName.equals(name)){
               count = urlRepo.getMap().get(name);
            }
        }

            return count;
        }
    }

