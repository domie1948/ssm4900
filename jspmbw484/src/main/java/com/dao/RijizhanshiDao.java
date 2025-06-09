package com.dao;

import com.entity.RijizhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RijizhanshiVO;
import com.entity.view.RijizhanshiView;


/**
 * 日记展示
 * 
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
public interface RijizhanshiDao extends BaseMapper<RijizhanshiEntity> {
	
	List<RijizhanshiVO> selectListVO(@Param("ew") Wrapper<RijizhanshiEntity> wrapper);
	
	RijizhanshiVO selectVO(@Param("ew") Wrapper<RijizhanshiEntity> wrapper);
	
	List<RijizhanshiView> selectListView(@Param("ew") Wrapper<RijizhanshiEntity> wrapper);

	List<RijizhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<RijizhanshiEntity> wrapper);
	
	RijizhanshiView selectView(@Param("ew") Wrapper<RijizhanshiEntity> wrapper);
	
}
