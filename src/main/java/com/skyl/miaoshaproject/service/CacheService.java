package com.skyl.miaoshaproject.service;

/**
 * Created by skyl on /2/16.
 */
//封装本地缓存操作类
public interface CacheService {
    //存方法
    void setCommonCache(String key,Object value);

    //取方法
    Object getFromCommonCache(String key);
}
