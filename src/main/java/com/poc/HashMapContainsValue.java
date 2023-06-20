package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HashMapContainsValue {
    public void exampleContainsValue() {
        Map<String, String> userCityMapping = new HashMap<>();
        userCityMapping.put("John", "New York");
        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Steve", "London");

        // Check if a value exists in a HashMap
        if (userCityMapping.containsValue("New York")) {
            log.info("--- There is a user in the userCityMapping who lives in New York");
        } else {
            log.info("--- There is not user in the userCityMapping who lives in New York");
        }
    }
}
