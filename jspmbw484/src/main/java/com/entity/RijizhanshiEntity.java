package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 日记展示
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
@TableName("rijizhanshi")
public class RijizhanshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RijizhanshiEntity() {
		
	}
	
	public RijizhanshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 日记编号
	 */
					
	private String rijibianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：日记编号
	 */
	public void setRijibianhao(String rijibianhao) {
		this.rijibianhao = rijibianhao;
	}
	/**
	 * 获取：日记编号
	 */
	public String getRijibianhao() {
		return rijibianhao;
	}
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
