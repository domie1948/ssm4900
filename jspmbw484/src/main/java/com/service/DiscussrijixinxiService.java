package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussrijixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussrijixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussrijixinxiView;


/**
 * 日记信息评论表
 *
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
public interface DiscussrijixinxiService extends IService<DiscussrijixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussrijixinxiVO> selectListVO(Wrapper<DiscussrijixinxiEntity> wrapper);
   	
   	DiscussrijixinxiVO selectVO(@Param("ew") Wrapper<DiscussrijixinxiEntity> wrapper);
   	
   	List<DiscussrijixinxiView> selectListView(Wrapper<DiscussrijixinxiEntity> wrapper);
   	
   	DiscussrijixinxiView selectView(@Param("ew") Wrapper<DiscussrijixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussrijixinxiEntity> wrapper);
   	
}

