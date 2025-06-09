package com.entity.view;

import com.entity.DiscussxinwentuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新闻推荐评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
@TableName("discussxinwentuijian")
public class DiscussxinwentuijianView  extends DiscussxinwentuijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxinwentuijianView(){
	}
 
 	public DiscussxinwentuijianView(DiscussxinwentuijianEntity discussxinwentuijianEntity){
 	try {
			BeanUtils.copyProperties(this, discussxinwentuijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
