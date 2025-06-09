package com.dao;

import com.entity.RijixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RijixinxiVO;
import com.entity.view.RijixinxiView;


/**
 * 日记信息
 * 
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
public interface RijixinxiDao extends BaseMapper<RijixinxiEntity> {
	
	List<RijixinxiVO> selectListVO(@Param("ew") Wrapper<RijixinxiEntity> wrapper);
	
	RijixinxiVO selectVO(@Param("ew") Wrapper<RijixinxiEntity> wrapper);
	
	List<RijixinxiView> selectListView(@Param("ew") Wrapper<RijixinxiEntity> wrapper);

	List<RijixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<RijixinxiEntity> wrapper);
	
	RijixinxiView selectView(@Param("ew") Wrapper<RijixinxiEntity> wrapper);
	
}
