package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HashMapRemoveKey {
    public void exampleRemoveKey() {
        Map<String, String> husbandWifeMapping = new HashMap<>();
        husbandWifeMapping.put("Jack", "Marie");
        husbandWifeMapping.put("Chris", "Lisa");
        husbandWifeMapping.put("Steve", "Jennifer");

        String husband = "Chris";
        String wife = husbandWifeMapping.remove(husband);
        log.info("--- husband " + wife + " removed successfully");
    }
}
