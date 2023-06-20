package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HashMapGetKey {
    public void exampleGetKey() {
        Map<String, String> userCityMapping = new HashMap<>();
        userCityMapping.put("John", "New York");
        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Steve", "London");

        log.info("--- Lisa's city : " + userCityMapping.get("Steve"));
    }
}
