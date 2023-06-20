package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class HashmapMultiMap {
    public void exampleMultiMap() {
        Map<String, List<String>> multimap = new HashMap<>();
        List<String> multiValueList = new ArrayList<>();
        multiValueList.add("value1");
        multiValueList.add("value2");
        multiValueList.add("value3");
        multimap.put("key1", multiValueList);
        log.info(multimap.toString());
    }
}
