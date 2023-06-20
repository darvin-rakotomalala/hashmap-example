package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HashmapNullKeyValue {
    public void exampleNullKeyValue() {
        Map<String, String> map = new HashMap<>();
        map.put(null, null);
        map.put(null, null);

        // iterate map using java 8 forEach method
        map.forEach((k, v) -> {
            log.info("Key : " + k);
            log.info("Value : " + v);
        });

        for (Map.Entry<String, String> entry : map.entrySet()) {
            log.info("Key : " + entry.getKey());
            log.info("Value : " + entry.getValue());
        }
    }

    public void exampleDuplicateKey() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key1", "value2");

        // iterate map using java 8 forEach method
        map.forEach((k, v) -> {
            log.info("Key : " + k);
            log.info("Value : " + v);
        });

        for (Map.Entry<String, String> entry : map.entrySet()) {
            log.info("Key : " + entry.getKey());
            log.info("Value : " + entry.getValue());
        }
    }

}
