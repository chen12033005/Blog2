package ssm.blog.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ssm.blog.entity.Album;
import ssm.blog.entity.Picture;
import ssm.blog.service.AlbumService;
import ssm.blog.service.PictureService;

/**
 * @title:AlbumContriller
 * @description
 * @author chenlc E-mail:chenliangchao@yihuacomputer.com
 * @date 2018年7月26日 下午2:24:48
 * @version 1.0
 */
@Controller
@RequestMapping("/album")
public class AlbumController {
	
	@Resource
	private AlbumService albumService;
	
	@Resource
	private PictureService pictureService;
	
	@RequestMapping("/myalbum")
	public ModelAndView myAlbum() {
		ModelAndView modelAndView = new ModelAndView();
		List<Album> albums = albumService.getAlbums();
		
		modelAndView.addObject("albums",albums);
		modelAndView.addObject("commonPage", "foreground/blogger/myAlbum.jsp");
		modelAndView.setViewName("albumMainTemp");
		return modelAndView;
	}
	
	@RequestMapping("/pictureList/{id}")
	public ModelAndView myPicture(@PathVariable("id") Integer id) {
		ModelAndView modelAndView = new ModelAndView();
		List<Picture> pictures = pictureService.getPicturesByAlbumId(id);
		
		modelAndView.addObject("title", "图片列表");
		modelAndView.addObject("pictures",pictures);
		modelAndView.addObject("commonPage", "foreground/blogger/myPictureList.jsp");
		modelAndView.setViewName("albumMainTemp");
		return modelAndView;
	}
	
}
