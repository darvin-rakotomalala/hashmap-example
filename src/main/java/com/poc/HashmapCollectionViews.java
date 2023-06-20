package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Slf4j
public class HashmapCollectionViews {
    public void exampleCollectionViews() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        // Returns a Set view of the keys contained in this map
        Set<String> keys = map.keySet();
        log.info("Set view of the keys : " + keys);

        // Returns a Collection view of the values contained in this map
        Collection<String> values = map.values();
        log.info("Collection view of the values : " + values);

        // Returns a Set view of the mappings contained in this map
        Set<Map.Entry<String, String>> entry = map.entrySet();
        log.info("Set view of the mappings : " + entry);

    }
}
