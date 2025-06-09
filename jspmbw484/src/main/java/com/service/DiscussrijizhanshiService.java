package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussrijizhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussrijizhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussrijizhanshiView;


/**
 * 日记展示评论表
 *
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
public interface DiscussrijizhanshiService extends IService<DiscussrijizhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussrijizhanshiVO> selectListVO(Wrapper<DiscussrijizhanshiEntity> wrapper);
   	
   	DiscussrijizhanshiVO selectVO(@Param("ew") Wrapper<DiscussrijizhanshiEntity> wrapper);
   	
   	List<DiscussrijizhanshiView> selectListView(Wrapper<DiscussrijizhanshiEntity> wrapper);
   	
   	DiscussrijizhanshiView selectView(@Param("ew") Wrapper<DiscussrijizhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussrijizhanshiEntity> wrapper);
   	
}

