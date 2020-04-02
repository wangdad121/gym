package com.zhiyou.gym.util;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {

    //声明key过期时间常量，比如30分钟
    private static final Long TIMEOUT = 1800L;

    //注入RedisTemplate
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    //注入ValueOperations
    @Autowired
    private ValueOperations<String,Object> valueOperations;

    @Autowired
    private ListOperations<String, Object> listOperations;

    @Autowired
    private SetOperations<String, Object> setOperations;

    @Autowired
    private ZSetOperations<String, Object> zsetOperations;

    @Autowired
    private HashOperations<String, Object, Object> hashOperations;

    //封装对key的操作，我们这就写一点点，思路做判断，调用方法

    /**
     * 判断key是否存在
     * @param keyName
     * @return
     */
    public Boolean hashKey(String keyName){
        //判断key是否为空
        if(keyName != null && !"".equals(keyName.trim())){
            //返回结果
            return redisTemplate.hasKey(keyName);
        }
        return false;
    }

    /**
     * 查看key的过期时间，返回值为秒
     * @param keyName
     * @return
     */
    public Long expire(String keyName){
        //判断key是否为空
        if(keyName != null && !"".equals(keyName.trim())){
            //返回结果
            return redisTemplate.getExpire(keyName);
        }
        return -2L;
    }

    //封装对String的操作

    /**
     * 封装永不过期，可以自己封装一个有过期时间的
     * @param keyName
     * @param value
     * @return
     */
    public Boolean set(String keyName,Object value,Long timeout){
        boolean flag = false;
        if(timeout != null && timeout > 0){
            //设置过期时间，默认为毫秒
            try{
                valueOperations.set(keyName,value,timeout, TimeUnit.MILLISECONDS);
                flag = true;
            }catch (Exception e){
                //异常处理
            }
        }else{
            try {
                valueOperations.set(keyName,value);
                flag = true;
            }catch (Exception e){

            }
        }
        return flag;
    }

    /**
     * 如果key存在返回，否则返回null
     * 或者自定义异常，返回KEY_NOT_FOUND
     * @param keyName
     * @return
     */
    public Object get(String keyName){
        //判断key是否为空
        if(keyName != null && !"".equals(keyName.trim())){
            //返回结果
            return valueOperations.get(keyName);
        }
        return null;
    }

    //封装对Hash的操作

    /**
     * 存储对象
     * @param keyName
     * @param value
     * @return
     */
    public Boolean put(String keyName,String code,Object value){
        try {
            //我们在存储和获取对象时code值需要一样，才能将对象取出来
            hashOperations.put(keyName,code,value);
            return true;
        }catch (Exception e){
            //处理异常
        }
        return false;
    }

    public Object getHash(String keyName,String code){
        //这个code值需要和存的时候值一样，我们根据key和code值获取对象
        return hashOperations.get(keyName,code);
    }


    /**
     * 封装对List的操作
     */

    /**
     * 封装对Set的操作
     */
    /**
     * 封装对ZSet的操作
     */

}
