package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HashMapIsEmpty {
    public void exampleIsEmpty() {
        Map<String, String> userCityMapping = new HashMap<>();

        // Check if a HashMap is empty
        log.info("--- is userCityMapping empty ? : " + userCityMapping.isEmpty());
    }
}
