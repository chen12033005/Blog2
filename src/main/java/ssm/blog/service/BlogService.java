package ssm.blog.service;

import java.util.List;
import java.util.Map;

import ssm.blog.entity.Blog;

/**
 * @author chen
 *
 */
public interface BlogService {

	public List<Blog> getBlogData();

	public List<Blog> listBlog(Map<String, Object> map);

	public Long getTotal(Map<String, Object> map);

	public Blog findById(Integer id);

	public Integer update(Blog blog);

	public Blog getPrevBlog(Integer id);

	public Blog getNextBlog(Integer id);

	public Integer addBlog(Blog blog);
	
	public Integer deleteBlog(Integer id);
	
	public Integer getBlogByTypeId(Integer typeId);
}
