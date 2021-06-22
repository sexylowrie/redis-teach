package xin.sunce.redis.demo;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Jedis连接池使用示例
 *
 * @author lowrie
 * @date 2019-04-24
 */
public class JedisPoolDemo {

    public static void main(String[] args) {
        JedisPool jedisPool = new JedisPool("140.143.156.50", 6666);
        Jedis jedis = jedisPool.getResource();
        jedis.set("test", "jedis");
        String value = jedis.get("test");
        System.out.println("value:" + value);
        jedis.close();
    }
}
