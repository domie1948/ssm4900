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


import com.dao.DiscussrijixinxiDao;
import com.entity.DiscussrijixinxiEntity;
import com.service.DiscussrijixinxiService;
import com.entity.vo.DiscussrijixinxiVO;
import com.entity.view.DiscussrijixinxiView;

@Service("discussrijixinxiService")
public class DiscussrijixinxiServiceImpl extends ServiceImpl<DiscussrijixinxiDao, DiscussrijixinxiEntity> implements DiscussrijixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussrijixinxiEntity> page = this.selectPage(
                new Query<DiscussrijixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussrijixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussrijixinxiEntity> wrapper) {
		  Page<DiscussrijixinxiView> page =new Query<DiscussrijixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussrijixinxiVO> selectListVO(Wrapper<DiscussrijixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussrijixinxiVO selectVO(Wrapper<DiscussrijixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussrijixinxiView> selectListView(Wrapper<DiscussrijixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussrijixinxiView selectView(Wrapper<DiscussrijixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
