package com.entity.view;

import com.entity.RijizhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 日记展示
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
@TableName("rijizhanshi")
public class RijizhanshiView  extends RijizhanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RijizhanshiView(){
	}
 
 	public RijizhanshiView(RijizhanshiEntity rijizhanshiEntity){
 	try {
			BeanUtils.copyProperties(this, rijizhanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
