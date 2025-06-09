package com.entity.model;

import com.entity.RijizhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 日记展示
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
public class RijizhanshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日记标题
	 */
	
	private String rijibiaoti;
		
	/**
	 * 日记内容
	 */
	
	private String rijineirong;
		
	/**
	 * 相关图片
	 */
	
	private String xiangguantupian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 日期
	 */
	
	private String riqi;
		
	/**
	 * 推荐原因
	 */
	
	private String tuijianyuanyin;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：日记标题
	 */
	 
	public void setRijibiaoti(String rijibiaoti) {
		this.rijibiaoti = rijibiaoti;
	}
	
	/**
	 * 获取：日记标题
	 */
	public String getRijibiaoti() {
		return rijibiaoti;
	}
				
	
	/**
	 * 设置：日记内容
	 */
	 
	public void setRijineirong(String rijineirong) {
		this.rijineirong = rijineirong;
	}
	
	/**
	 * 获取：日记内容
	 */
	public String getRijineirong() {
		return rijineirong;
	}
				
	
	/**
	 * 设置：相关图片
	 */
	 
	public void setXiangguantupian(String xiangguantupian) {
		this.xiangguantupian = xiangguantupian;
	}
	
	/**
	 * 获取：相关图片
	 */
	public String getXiangguantupian() {
		return xiangguantupian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(String riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public String getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：推荐原因
	 */
	 
	public void setTuijianyuanyin(String tuijianyuanyin) {
		this.tuijianyuanyin = tuijianyuanyin;
	}
	
	/**
	 * 获取：推荐原因
	 */
	public String getTuijianyuanyin() {
		return tuijianyuanyin;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
