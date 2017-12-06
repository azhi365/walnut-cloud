package com.innstack.walnut.redis.utils;

import com.innstack.walnut.redis.RedisApplicationTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RedisApplicationTest.class)
public class RedisUtilTest {
    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void getKeys() {
        System.out.print("---------------" + redisUtil);
        Set<String> set = redisUtil.getKeys("walnut:spirit:*");
        System.out.print("---------------");
        for (String str : set) {
            System.out.print("--------str:" + str);
        }
    }
}