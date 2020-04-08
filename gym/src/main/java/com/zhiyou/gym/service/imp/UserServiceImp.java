package com.zhiyou.gym.service.imp;

import com.zhiyou.gym.entity.Chinese2PinYinUtils;
import com.zhiyou.gym.mapper.UserMapper;
import com.zhiyou.gym.pojo.User;
import com.zhiyou.gym.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer insertIntoUserFId(User user) {
        userMapper.insert(user);
        User user1 = userMapper.selectByPhone(user.getPhone());
        return user1.getId();
    }

    @Override
    public void insertUser(User user) {
        Date time1= new java.sql.Date(new Date().getTime());
        user.setTime((java.sql.Date) time1);
        String s = Chinese2PinYinUtils.trans2PinYin(user.getName());
        user.setUserAccount(s);
        user.setUserPassword(s);

        userMapper.insert(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public void updateUer(User user) {
        String s = Chinese2PinYinUtils.trans2PinYin(user.getName());
        user.setUserAccount(s);
        user.setUserPassword(s);



        userMapper.updateById(user);
    }



    @Override
    public List<User> selectAllUser() {
        String key="user:info";
        Boolean aBoolean = redisTemplate.hasKey(key);
        ValueOperations op = redisTemplate.opsForValue();
        if(aBoolean == false){
            List<User> users = userMapper.selectList(null);


                    op.set(key,users);

            return users;
        }else {
            Object o = op.get(key);
            return (List<User>) o;
        }


    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }
}
