package com.dao;

import com.entity.DiscussrijizhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussrijizhanshiVO;
import com.entity.view.DiscussrijizhanshiView;


/**
 * 日记展示评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
public interface DiscussrijizhanshiDao extends BaseMapper<DiscussrijizhanshiEntity> {
	
	List<DiscussrijizhanshiVO> selectListVO(@Param("ew") Wrapper<DiscussrijizhanshiEntity> wrapper);
	
	DiscussrijizhanshiVO selectVO(@Param("ew") Wrapper<DiscussrijizhanshiEntity> wrapper);
	
	List<DiscussrijizhanshiView> selectListView(@Param("ew") Wrapper<DiscussrijizhanshiEntity> wrapper);

	List<DiscussrijizhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussrijizhanshiEntity> wrapper);
	
	DiscussrijizhanshiView selectView(@Param("ew") Wrapper<DiscussrijizhanshiEntity> wrapper);
	
}
