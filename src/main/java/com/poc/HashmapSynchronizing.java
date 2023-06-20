package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class HashmapSynchronizing {
    public void exampleSynchronizing() {
        Map<String, String> currencies = new HashMap<>();
        currencies.put("USA", "USD");
        currencies.put("England", "GBP");
        currencies.put("Canada", "CAD");
        currencies.put("HongKong", "HKD");
        currencies.put("Australia", "AUD");

        // Synchronizing HashMap in Java
        currencies = Collections.synchronizedMap(currencies);

        // Make sure to synchronize Map while Iterating
        // getting key set can be outside synchronized block
        Set<String> keySet = currencies.keySet();

        synchronized (currencies) {
            for (String s : keySet) {
                log.info("Key : " + s);
            }
        }
    }
}
