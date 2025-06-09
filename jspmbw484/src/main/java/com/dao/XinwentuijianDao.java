package com.dao;

import com.entity.XinwentuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinwentuijianVO;
import com.entity.view.XinwentuijianView;


/**
 * 新闻推荐
 * 
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
public interface XinwentuijianDao extends BaseMapper<XinwentuijianEntity> {
	
	List<XinwentuijianVO> selectListVO(@Param("ew") Wrapper<XinwentuijianEntity> wrapper);
	
	XinwentuijianVO selectVO(@Param("ew") Wrapper<XinwentuijianEntity> wrapper);
	
	List<XinwentuijianView> selectListView(@Param("ew") Wrapper<XinwentuijianEntity> wrapper);

	List<XinwentuijianView> selectListView(Pagination page,@Param("ew") Wrapper<XinwentuijianEntity> wrapper);
	
	XinwentuijianView selectView(@Param("ew") Wrapper<XinwentuijianEntity> wrapper);
	
}
