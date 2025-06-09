package com.dao;

import com.entity.DiscussrijixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussrijixinxiVO;
import com.entity.view.DiscussrijixinxiView;


/**
 * 日记信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
public interface DiscussrijixinxiDao extends BaseMapper<DiscussrijixinxiEntity> {
	
	List<DiscussrijixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussrijixinxiEntity> wrapper);
	
	DiscussrijixinxiVO selectVO(@Param("ew") Wrapper<DiscussrijixinxiEntity> wrapper);
	
	List<DiscussrijixinxiView> selectListView(@Param("ew") Wrapper<DiscussrijixinxiEntity> wrapper);

	List<DiscussrijixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussrijixinxiEntity> wrapper);
	
	DiscussrijixinxiView selectView(@Param("ew") Wrapper<DiscussrijixinxiEntity> wrapper);
	
}
