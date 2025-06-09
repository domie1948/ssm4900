package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinwentuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinwentuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinwentuijianView;


/**
 * 新闻推荐
 *
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
public interface XinwentuijianService extends IService<XinwentuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwentuijianVO> selectListVO(Wrapper<XinwentuijianEntity> wrapper);
   	
   	XinwentuijianVO selectVO(@Param("ew") Wrapper<XinwentuijianEntity> wrapper);
   	
   	List<XinwentuijianView> selectListView(Wrapper<XinwentuijianEntity> wrapper);
   	
   	XinwentuijianView selectView(@Param("ew") Wrapper<XinwentuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwentuijianEntity> wrapper);
   	
}

