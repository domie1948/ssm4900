package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxinwentuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxinwentuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxinwentuijianView;


/**
 * 新闻推荐评论表
 *
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
public interface DiscussxinwentuijianService extends IService<DiscussxinwentuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxinwentuijianVO> selectListVO(Wrapper<DiscussxinwentuijianEntity> wrapper);
   	
   	DiscussxinwentuijianVO selectVO(@Param("ew") Wrapper<DiscussxinwentuijianEntity> wrapper);
   	
   	List<DiscussxinwentuijianView> selectListView(Wrapper<DiscussxinwentuijianEntity> wrapper);
   	
   	DiscussxinwentuijianView selectView(@Param("ew") Wrapper<DiscussxinwentuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxinwentuijianEntity> wrapper);
   	
}

