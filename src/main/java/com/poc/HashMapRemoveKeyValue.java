package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HashMapRemoveKeyValue {
    public void exampleRemoveKeyValue() {
        Map<String, String> husbandWifeMapping = new HashMap<>();
        husbandWifeMapping.put("Jack", "Marie");
        husbandWifeMapping.put("Chris", "Lisa");
        husbandWifeMapping.put("Steve", "Jennifer");

        // Remove a key from the HashMap only if it is mapped to the given value
        // Ex - Divorce "Jack" only if He is married to "Linda"
        boolean isRemoved = husbandWifeMapping.remove("Jack", "Linda");
        log.info("Did Jack get removed from the mapping ? : " + isRemoved);
    }
}
