package com.dharmendra.URL_hit_counter.dataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSource {

    @Bean
    public Map<String, Integer> map(){
        return new HashMap<>();
    }


}
