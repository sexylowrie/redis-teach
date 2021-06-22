package xin.sunce.redis.demo;

import redis.clients.jedis.Jedis;

/**
 * Jedis使用示例
 *
 * @author lowrie
 * @date 2019-04-24
 */
public class JedisDemo {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("140.143.156.50", 6666);
        jedis.set("hello", "world");
        String value = jedis.get("hello");
        System.out.println("value:" + value);
        jedis.close();
    }
}
