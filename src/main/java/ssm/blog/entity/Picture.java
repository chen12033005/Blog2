package ssm.blog.entity;

import java.util.Date;

/**
 * @title:Album
 * @description 图片类
 * @author chenlc E-mail:chenliangchao@yihuacomputer.com
 * @date 2018年7月13日 下午2:36:55
 * @version 1.0
 */
public class Picture {

	private int id;//图片id
	private String pictureName;//图片名称
	private int albumId;//图片所属相册
	private int orderNum;//图片排序
	private float height;//图片高度
	private float width;//图片宽度
	private Date releaseDate;//发布日期
	private Date updateDate;//发布日期
	private String reserve1;//预留字段1
	private String reserve2;//预留字段2
	private String reserve3;//预留字段3
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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
	public String getPictureName() {
		return pictureName;
	}
	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
	@Override
	public String toString() {
		return "Picture [id=" + id + ", pictureName=" + pictureName + ", albumId=" + albumId + ", orderNum=" + orderNum + ", height=" + height + ", width=" + width + ", releaseDate=" + releaseDate + ", updateDate=" + updateDate + ", reserve1=" + reserve1 + ", reserve2=" + reserve2 + ", reserve3=" + reserve3 + ", getId()=" + getId() + ", getAlbumId()=" + getAlbumId() + ", getOrderNum()="
				+ getOrderNum() + ", getHeight()=" + getHeight() + ", getWidth()=" + getWidth() + ", getReleaseDate()=" + getReleaseDate() + ", getUpdateDate()=" + getUpdateDate() + ", getReserve1()=" + getReserve1() + ", getReserve2()=" + getReserve2() + ", getReserve3()=" + getReserve3() + ", getPictureName()=" + getPictureName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
