package com.dao;

import com.entity.DiscussxinwentuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxinwentuijianVO;
import com.entity.view.DiscussxinwentuijianView;


/**
 * 新闻推荐评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
public interface DiscussxinwentuijianDao extends BaseMapper<DiscussxinwentuijianEntity> {
	
	List<DiscussxinwentuijianVO> selectListVO(@Param("ew") Wrapper<DiscussxinwentuijianEntity> wrapper);
	
	DiscussxinwentuijianVO selectVO(@Param("ew") Wrapper<DiscussxinwentuijianEntity> wrapper);
	
	List<DiscussxinwentuijianView> selectListView(@Param("ew") Wrapper<DiscussxinwentuijianEntity> wrapper);

	List<DiscussxinwentuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxinwentuijianEntity> wrapper);
	
	DiscussxinwentuijianView selectView(@Param("ew") Wrapper<DiscussxinwentuijianEntity> wrapper);
	
}
