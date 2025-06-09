package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RijixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RijixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RijixinxiView;


/**
 * 日记信息
 *
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
public interface RijixinxiService extends IService<RijixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RijixinxiVO> selectListVO(Wrapper<RijixinxiEntity> wrapper);
   	
   	RijixinxiVO selectVO(@Param("ew") Wrapper<RijixinxiEntity> wrapper);
   	
   	List<RijixinxiView> selectListView(Wrapper<RijixinxiEntity> wrapper);
   	
   	RijixinxiView selectView(@Param("ew") Wrapper<RijixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RijixinxiEntity> wrapper);
   	
}

