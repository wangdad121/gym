package com.zhiyou.gym.ifconfig;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisTemplateConfig {

    /**
     * 修改SpringDataRedis中的RedisTemplate对象的Key类型改为String类型
     * 意思就是说，将Redis中的key存储为String类型，默认是Object类型
     */
    @Bean
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory connectionFactory){
        //创建RedisTemplate对象
        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<String,Object>();
        //设置连接工厂
        redisTemplate.setConnectionFactory(connectionFactory);
        // 使用Jackson2JsonRedisSerialize替换默认序列化
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        // key采用String的序列化方式
        redisTemplate.setKeySerializer(stringRedisSerializer);
        // hash的key也采用String的序列化方式
        redisTemplate.setHashKeySerializer(stringRedisSerializer);
        // value序列化方式采用jackson
        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
        // hash的value序列化方式采用jackson
        redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }
    /**
     * 创建ValueOperations<String, Object>对象,存储到IOC容器中
     */
    @Bean
    public ValueOperations<String, Object> valueOperations(RedisTemplate<String,Object> redisTemplate){
         return redisTemplate.opsForValue();
    }

    /**
     * 创建操作list类型对象
     * @param redisTemplate
     * @return
     */
    @Bean
    public ListOperations<String, Object> listOperations(RedisTemplate<String,Object> redisTemplate){
         return redisTemplate.opsForList();
    }

    /**
     * 创建操作set类型对象
     * @param redisTemplate
     * @return
     */
    @Bean
    public SetOperations<String, Object> setOperations(RedisTemplate<String,Object> redisTemplate){
         return redisTemplate.opsForSet();
    }

    /**
     * 创建操作zset类型对象
     * @param redisTemplate
     * @return
     */
    @Bean
    public ZSetOperations<String, Object> zsetOperations(RedisTemplate<String,Object> redisTemplate){
         return redisTemplate.opsForZSet();
    }

    /**
     * 操作hash类型对象
     * @param redisTemplate
     * @return
             */
    @Bean
    public HashOperations<String, Object, Object> hashOperations(RedisTemplate<String,Object> redisTemplate){
        return redisTemplate.opsForHash();
    }
}
