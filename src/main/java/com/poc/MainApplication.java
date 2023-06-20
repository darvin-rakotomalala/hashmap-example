package com.poc;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.LocalDateTime;

@Slf4j
@SpringBootApplication
public class MainApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("############################   RUN   ############################");

        CreateHashMap createHashMap = new CreateHashMap();
        createHashMap.exampleCreateHashMap();

        log.info("-----------------------------------------------------------------");
        PutHashMap putHashMap = new PutHashMap();
        putHashMap.examplePutHashMap();

        log.info("-----------------------------------------------------------------");
        PutIfAbsent putIfAbsent = new PutIfAbsent();
        putIfAbsent.examplePutIfAbsent();

        log.info("-----------------------------------------------------------------");
        HashMapIsEmpty isEmpty = new HashMapIsEmpty();
        isEmpty.exampleIsEmpty();

        log.info("-----------------------------------------------------------------");
        HasMapSize hasMapSize = new HasMapSize();
        hasMapSize.exampleHasMapSize();

        log.info("-----------------------------------------------------------------");
        HashMapContainsKey containsKey = new HashMapContainsKey();
        containsKey.exampleContainsKey();

        log.info("-----------------------------------------------------------------");
        HashMapContainsValue containsValue = new HashMapContainsValue();
        containsValue.exampleContainsValue();

        log.info("-----------------------------------------------------------------");
        HashMapGetKey getKey = new HashMapGetKey();
        getKey.exampleGetKey();

        log.info("-----------------------------------------------------------------");
        HashMapRemoveKey removeKey = new HashMapRemoveKey();
        removeKey.exampleRemoveKey();

        log.info("-----------------------------------------------------------------");
        HashMapRemoveKeyValue removeKeyValue = new HashMapRemoveKeyValue();
        removeKeyValue.exampleRemoveKeyValue();

        log.info("-----------------------------------------------------------------");
        HashmapNullKeyValue nullKeyValue = new HashmapNullKeyValue();
        nullKeyValue.exampleNullKeyValue();

        log.info("-----------------------------------------------------------------");
        HashmapNullKeyValue duplicateKey = new HashmapNullKeyValue();
        duplicateKey.exampleDuplicateKey();

        log.info("-----------------------------------------------------------------");
        HashmapCollectionViews collectionViews = new HashmapCollectionViews();
        collectionViews.exampleCollectionViews();

        log.info("-----------------------------------------------------------------");
        IterateMap iterateMap = new IterateMap();
        iterateMap.exampleIterateMap();

        log.info("-----------------------------------------------------------------");
        HashmapMultiMap multiMap = new HashmapMultiMap();
        multiMap.exampleMultiMap();

        log.info("-----------------------------------------------------------------");
        ForEachWithMap forEachWithMap = new ForEachWithMap();
        forEachWithMap.exampleForEachWithMap();

        log.info("-----------------------------------------------------------------");
        HashmapSynchronizing synchronizing = new HashmapSynchronizing();
        synchronizing.exampleSynchronizing();

    }
}
