package ssm.blog.dao;

import java.util.List;

import ssm.blog.entity.Album;

/**
 * @title:AlbumDao
 * @description
 * @author chenlc E-mail:chenliangchao@yihuacomputer.com
 * @date 2018年7月13日 下午2:56:01
 * @version 1.0
 */
public interface AlbumDao {

	public List<Album> getAlbums();
}
