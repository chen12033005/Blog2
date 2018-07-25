package ssm.blog.service;

import java.util.List;
import java.util.Map;

import ssm.blog.entity.BlogType;

/**
 * @Description �������Service�ӿ�
 * @author chen
 *
 */
public interface BlogTypeService {

	public List<BlogType> getBlogTypeData();

	// ��ҳ��ѯ���������Ϣ
	public List<BlogType> listBlogType(Map<String, Object> map);

	// ��ȡ�ܼ�¼��
	public Long getTotal(Map<String, Object> map);
	
	// ��Ӳ������
	public Integer addBlogType(BlogType blogType);
	
	// ���²������
	public Integer updateBlogType(BlogType blogType);
	
	// ɾ������
	public Integer deleteBlogType(Integer id);
}
