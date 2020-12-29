package org.apache.zookeeper.book;

import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;

import java.util.Random;

/**
 * @description:
 * @author: lilei12
 * @create: 2020-12-29 12:04
 **/

public class TestRandomUtils {

    @Test
    void test1() {
        int odd = 0, even = 0; // 大家平时声明变量可别挤一行，会造成可读性下降的，这是一个反例，我就是顺便科普下。
        for (int i = 0; i < 10000; i++) {
            long a = RandomUtils.nextLong(0, Integer.MAX_VALUE);
            if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("odd:" + odd + ", even:" + even);
        // 期待的结果是五五开对吧？
    }

    @Test
    void test2() {
        double d = Long.MAX_VALUE;
        long l = (long) d;
        double d1 = Integer.MAX_VALUE;
        System.out.println(d);
        System.out.println(d1);
        System.out.println("l:"+l+" Long" +Long.MAX_VALUE);
        System.out.println("-int :"+ (-(long)Integer.MIN_VALUE));
        System.out.println("+int :"+ (Integer.MAX_VALUE));
        System.out.println("abs int "+Math.abs( (long) Integer.MIN_VALUE));
        System.out.println("abs "+((Integer.MIN_VALUE < 0) ? (-(long)Integer.MIN_VALUE) : Integer.MIN_VALUE));
        int odd = 0, even = 0; // 大家平时声明变量可别挤一行，会造成可读性下降的，这是一个反例，我就是顺便科普下。
        for (int i = 0; i < 10000; i++) {
            Random r = new Random();
//            long a = r.nextLong();
            long a = RandomUtils.nextLong(0,Long.MAX_VALUE);
            if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("odd:" + odd + ", even:" + even);
        // 觉得结果还是五五开么？
    }
}
