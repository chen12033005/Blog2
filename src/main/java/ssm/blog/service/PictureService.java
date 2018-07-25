package ssm.blog.service;

import java.util.List;

import ssm.blog.entity.Picture;

/**
 * @title:PictureService
 * @description
 * @author chenlc E-mail:chenliangchao@yihuacomputer
 * @date 2018年7月13日 下午3:06:12
 * @version 1.0
 */
public interface PictureService {

	public List<Picture> getPicturesByAlbumId(int albumId);
	
}
