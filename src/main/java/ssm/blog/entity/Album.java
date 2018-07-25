package ssm.blog.entity;

import java.util.Date;

/**
 * @title:Album
 * @description 相册类
 * @author chenlc E-mail:chenliangchao@yihuacomputer.com
 * @date 2018年7月13日 下午2:36:55
 * @version 1.0
 */
public class Album {

	private int id;//相册id
	private String title;//相册标题
	private String summary;//相册摘要
	private Date releaseDate;//发布日期
	private String albumPhoto;//相册缩略图
	private String reserve1;//预留字段1
	private String reserve2;//预留字段2
	private String reserve3;//预留字段3
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getAlbumPhoto() {
		return albumPhoto;
	}
	public void setAlbumPhoto(String albumPhoto) {
		this.albumPhoto = albumPhoto;
	}
	public String getReserve1() {
		return reserve1;
	}
	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}
	public String getReserve2() {
		return reserve2;
	}
	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}
	public String getReserve3() {
		return reserve3;
	}
	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}
	@Override
	public String toString() {
		return "Album [id=" + id + ", title=" + title + ", summary=" + summary + ", releaseDate=" + releaseDate + ", albumPhoto=" + albumPhoto + ", reserve1=" + reserve1 + ", reserve2=" + reserve2 + ", reserve3=" + reserve3 + "]";
	}
	
}
