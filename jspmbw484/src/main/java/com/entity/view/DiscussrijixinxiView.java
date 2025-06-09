package com.entity.view;

import com.entity.DiscussrijixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 日记信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
@TableName("discussrijixinxi")
public class DiscussrijixinxiView  extends DiscussrijixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussrijixinxiView(){
	}
 
 	public DiscussrijixinxiView(DiscussrijixinxiEntity discussrijixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussrijixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
