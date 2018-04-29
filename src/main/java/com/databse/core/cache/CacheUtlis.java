package com.databse.core.cache;
import com.google.common.collect.Lists;

import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * 缓存工具类
 * 简单实现
 */
public class CacheUtlis {

    private static Map<String,Object> _cache = Collections.synchronizedMap(new HashMap<String,Object>());


    /***
     * 添加缓存
     * @param key 键值
     * @param value 值
     */
    public static void putCache(@NotNull String key, Object value){
        _cache.put(key,value);
    }

    /**
     * 获取缓存
     * @param key 键值
     * @return
     *  返回缓存的值
     */
    public static Object getCacheValue(@NotNull String key){
        return _cache.get(key);
    }

    /***
     * 检查key是否存在
     * @param key
     * @return
     */
    public static boolean containsKey(@NotNull String key){
       return _cache.containsKey(key);
    }

    /***
     *
     * @return
     */
    public static List<String> getKeys(){
        List<String> keys = Lists.newArrayList();
        _cache.forEach((key,value)->{
                keys.add(key);
        });
        return keys;
    }

    public static void clearCache(){
        _cache.clear();
    }

    public static void clearCache(@NotNull String key){
        _cache.remove(key);
    }


}
