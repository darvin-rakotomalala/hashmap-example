package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HashMapContainsKey {
    public void exampleContainsKey() {
        Map<String, String> userCityMapping = new HashMap<>();
        userCityMapping.put("John", "New York");
        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Steve", "London");

        String userName = "Steve";
        // Check if a key exists in the HashMap
        if (userCityMapping.containsKey(userName)) {
            // Get the value assigned to a given key in the HashMap
            String city = userCityMapping.get(userName);
            log.info("--- " + userName + " lives in " + city);
        } else {
            log.info("--- City details not found for user " + userName);
        }
    }
}
