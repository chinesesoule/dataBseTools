package com.databse.core.cache;

/**/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.NotNull;
import java.util.*;

public class Cache<K,cacheEntity extends com.databse.core.cache.CacheEntity> {
    private Map<K,cacheEntity> cache;
    private int cacheSize = 100;
    private final Float DEFAULT_LOAD_FACTORY = 0.75f;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public Cache(int cacheSzie){
        this.cacheSize = cacheSzie;
        int capacity = (int)Math.ceil(cacheSize / DEFAULT_LOAD_FACTORY) + 1;
        cache = new LinkedHashMap<K,cacheEntity>(capacity,DEFAULT_LOAD_FACTORY,false){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K,cacheEntity> eldest) {
                return size() > cacheSzie;
            }
        };
    }

    public Cache(){
        int capacity = (int)Math.ceil(this.cacheSize / DEFAULT_LOAD_FACTORY) + 1;
        cache = new LinkedHashMap<K,cacheEntity>(capacity,DEFAULT_LOAD_FACTORY,false){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K,cacheEntity> eldest) {
                return size() > cacheSize;
            }
        };
    }

    /**
     * 增加缓存
     * @param key 缓存键
     * @param vlaye 缓存值
     */
    public synchronized void put(@NotNull K key, cacheEntity vlaye){
        cache.put(key, vlaye);
    }

    public synchronized void remove(@NotNull K key){
        cache.remove(key);
    }

    public synchronized void removeAll(){
        cache.clear();
    }

    public synchronized String[] keys(){
       return (String[])cache.keySet().toArray();
    }

    public synchronized boolean checkKey(@NotNull K key){
        return cache.containsKey(key);
    }

    private synchronized boolean autoRemoveKey(){

        return false;
    }
    public synchronized cacheEntity get(@NotNull K key){
        return cache.get(key);
    }


}