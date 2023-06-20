package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HasMapSize {
    public void exampleHasMapSize() {
        Map<String, String> userCityMapping = new HashMap<>();
        userCityMapping.put("John", "New York");
        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Steve", "London");

        // Find the size of a HashMap
        log.info("--- We have the city information of " + userCityMapping.size() + " users");
    }
}
