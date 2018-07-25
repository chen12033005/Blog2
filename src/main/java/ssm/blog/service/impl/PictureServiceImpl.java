package ssm.blog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssm.blog.dao.PictureDao;
import ssm.blog.entity.Picture;
import ssm.blog.service.PictureService;

/**
 * @title:PictureServiceImpl
 * @description
 * @author chenlc E-mail:chenliangchao@yihuacomputer.com
 * @date 2018年7月13日 下午3:11:19
 * @version 1.0
 */
@Service
public class PictureServiceImpl implements PictureService {

	@Resource
	private PictureDao pictureDao;
	
	@Override
	public List<Picture> getPicturesByAlbumId(int albumId) {
		return pictureDao.getPicturesByAlbumId(albumId);
	}

}
