package com.poc;

import com.poc.dto.PersonDTO;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class ForEachWithMap {
    public void exampleForEachWithMap() {
        final Map<Integer, PersonDTO> map = new HashMap<>();
        map.put(1, new PersonDTO(100, "Ramesh"));
        map.put(2, new PersonDTO(100, "Ram"));
        map.put(3, new PersonDTO(100, "Prakash"));
        map.put(4, new PersonDTO(100, "Amir"));
        map.put(5, new PersonDTO(100, "Sharuk"));

        log.info("# Before Java 8, for loop map ---------");
        for (final Map.Entry<Integer, PersonDTO> entry : map.entrySet()) {
            log.info("Key : " + entry.getKey());
            log.info("Value : " + entry.getValue().getName());
        }

        log.info("# In Java 8, you can loop a Map with forEach + lambda expression ---------");
        map.forEach((k, p) -> {
            log.info("Key : " + k);
            log.info("Value : " + p.getName());
        });
    }

}
