package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RijizhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RijizhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RijizhanshiView;


/**
 * 日记展示
 *
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
public interface RijizhanshiService extends IService<RijizhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RijizhanshiVO> selectListVO(Wrapper<RijizhanshiEntity> wrapper);
   	
   	RijizhanshiVO selectVO(@Param("ew") Wrapper<RijizhanshiEntity> wrapper);
   	
   	List<RijizhanshiView> selectListView(Wrapper<RijizhanshiEntity> wrapper);
   	
   	RijizhanshiView selectView(@Param("ew") Wrapper<RijizhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RijizhanshiEntity> wrapper);
   	
}

