package ssm.blog.redis;

import redis.clients.jedis.ShardedJedis;

/**
 * @title:RedisDateSource
 * @description
 * @author chenlc E-mail:chenliangchao@yihuacomputer
 * @date 2018年7月24日 上午9:58:03
 * @version 1.0
 */
public interface RedisDataSource {
    public abstract ShardedJedis getRedisClient();
    public void returnResource(ShardedJedis shardedJedis);
    public void returnResource(ShardedJedis shardedJedis,boolean broken);
}
