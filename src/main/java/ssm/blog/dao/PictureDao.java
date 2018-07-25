package ssm.blog.dao;

import java.util.List;

import ssm.blog.entity.Picture;

/**
 * @title:PictureDao
 * @description
 * @author chenlc E-mail:chenliangchao@yihuacomputer.com
 * @date 2018年7月13日 下午2:56:31
 * @version 1.0
 */
public interface PictureDao {
	
	public List<Picture> getPicturesByAlbumId(int albumId);
}
