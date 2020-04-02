package com.zhiyou.gym.util;

/**
 * 对Redis的key进行约束，看你们公司具体的要求
 * 可能每个公司的也不同，key的规范也不一样
 * 这个类时构建项目时由团队协商开发的，项目中其他的模块要使用Redis就需要调用这个工具类使用
 */
public class KeyUtils {

    /**
     * 我们向Redis中存储JavaBean就是我们的实体类使用Hash类型
     * 我们给hash类型确定规则一般是    实体类名:主键值:实体类字段
     * 比如我们要存储id为1的用户数据，user:1:id
     * 三个参数分别为表名，主键ID，字段名
     * 生成的规则如上所示，他们中间都需要追加一个:
     */
    public static String hashKey(String tableName,Integer userId,String tableFiled){
        //写字符串判断，我们这偷个懒先不写
        return tableName+":"+userId+":"+tableFiled;
    }
}
