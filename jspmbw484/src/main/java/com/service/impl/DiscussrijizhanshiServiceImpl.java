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


import com.dao.DiscussrijizhanshiDao;
import com.entity.DiscussrijizhanshiEntity;
import com.service.DiscussrijizhanshiService;
import com.entity.vo.DiscussrijizhanshiVO;
import com.entity.view.DiscussrijizhanshiView;

@Service("discussrijizhanshiService")
public class DiscussrijizhanshiServiceImpl extends ServiceImpl<DiscussrijizhanshiDao, DiscussrijizhanshiEntity> implements DiscussrijizhanshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussrijizhanshiEntity> page = this.selectPage(
                new Query<DiscussrijizhanshiEntity>(params).getPage(),
                new EntityWrapper<DiscussrijizhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussrijizhanshiEntity> wrapper) {
		  Page<DiscussrijizhanshiView> page =new Query<DiscussrijizhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussrijizhanshiVO> selectListVO(Wrapper<DiscussrijizhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussrijizhanshiVO selectVO(Wrapper<DiscussrijizhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussrijizhanshiView> selectListView(Wrapper<DiscussrijizhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussrijizhanshiView selectView(Wrapper<DiscussrijizhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
