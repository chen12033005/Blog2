package ssm.blog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssm.blog.dao.AlbumDao;
import ssm.blog.entity.Album;
import ssm.blog.service.AlbumService;

/**
 * @title:AlbumServiceIpml
 * @description
 * @author chenlc E-mail:chenliangchao@yihuacomputer
 * @date 2018年7月13日 下午3:07:55
 * @version 1.0
 */
@Service
public class AlbumServiceIpml implements AlbumService {

	@Resource
	private AlbumDao albumDao;
	
	@Override
	public List<Album> getAlbums() {
		return albumDao.getAlbums(); 
	}

}
