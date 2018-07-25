package ssm.blog;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ssm.blog.redis.RedisClientTemplate;
import ssm.blog.service.AlbumService;
import ssm.blog.service.BloggerService;

/**
 * @title:TestRedis
 * @description
 * @author chenlc E-mail:chenliangchao@yihuacomputer
 * @date 2018年7月24日 下午2:49:29
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
@Transactional
public class TestRedis {

	@Resource
	private BloggerService bloggerService;
	
	@Autowired
	private RedisClientTemplate redisClientTemplate;
	
	@Resource
	private AlbumService albumService;
	
	@Test
	public void test(){
//		System.out.println(bloggerService.getBloggerData().getUsername());
		
		System.out.println(redisClientTemplate.get("aaa"));
		
		redisClientTemplate.set("test","111");
		
		System.out.println(redisClientTemplate.exists("aaa") + "-----" + redisClientTemplate.exists("sss"));
		
		System.out.println(redisClientTemplate.type("test"));
		
		
	}
}
