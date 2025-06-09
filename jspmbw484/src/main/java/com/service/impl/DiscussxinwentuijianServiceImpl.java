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


import com.dao.DiscussxinwentuijianDao;
import com.entity.DiscussxinwentuijianEntity;
import com.service.DiscussxinwentuijianService;
import com.entity.vo.DiscussxinwentuijianVO;
import com.entity.view.DiscussxinwentuijianView;

@Service("discussxinwentuijianService")
public class DiscussxinwentuijianServiceImpl extends ServiceImpl<DiscussxinwentuijianDao, DiscussxinwentuijianEntity> implements DiscussxinwentuijianService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxinwentuijianEntity> page = this.selectPage(
                new Query<DiscussxinwentuijianEntity>(params).getPage(),
                new EntityWrapper<DiscussxinwentuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxinwentuijianEntity> wrapper) {
		  Page<DiscussxinwentuijianView> page =new Query<DiscussxinwentuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxinwentuijianVO> selectListVO(Wrapper<DiscussxinwentuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxinwentuijianVO selectVO(Wrapper<DiscussxinwentuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxinwentuijianView> selectListView(Wrapper<DiscussxinwentuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxinwentuijianView selectView(Wrapper<DiscussxinwentuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
