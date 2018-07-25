package ssm.blog.dao;

import java.util.List;
import java.util.Map;

import ssm.blog.entity.Link;

/**
 * @Description ��������dao�ӿ�
 * @author chen
 *
 */
public interface LinkDao {

	// ��ȡ��������
	public List<Link> getLinkData();

	// ��ҳ��ȡ��������
	public List<Link> listLinkData(Map<String, Object> map);

	// ��ȡ�ܼ�¼��
	public Long getTotal(Map<String, Object> map);

	// �����������
	public Integer addLink(Link link);

	// ������������
	public Integer updateLink(Link link);

	// ɾ����������
	public Integer deleteLink(Integer id);
}
