package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XinwentuijianDao;
import com.entity.XinwentuijianEntity;
import com.service.XinwentuijianService;
import com.entity.vo.XinwentuijianVO;
import com.entity.view.XinwentuijianView;

@Service("xinwentuijianService")
public class XinwentuijianServiceImpl extends ServiceImpl<XinwentuijianDao, XinwentuijianEntity> implements XinwentuijianService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwentuijianEntity> page = this.selectPage(
                new Query<XinwentuijianEntity>(params).getPage(),
                new EntityWrapper<XinwentuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwentuijianEntity> wrapper) {
		  Page<XinwentuijianView> page =new Query<XinwentuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinwentuijianVO> selectListVO(Wrapper<XinwentuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinwentuijianVO selectVO(Wrapper<XinwentuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinwentuijianView> selectListView(Wrapper<XinwentuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwentuijianView selectView(Wrapper<XinwentuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
