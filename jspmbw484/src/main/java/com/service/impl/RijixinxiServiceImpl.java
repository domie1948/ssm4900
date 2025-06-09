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


import com.dao.RijixinxiDao;
import com.entity.RijixinxiEntity;
import com.service.RijixinxiService;
import com.entity.vo.RijixinxiVO;
import com.entity.view.RijixinxiView;

@Service("rijixinxiService")
public class RijixinxiServiceImpl extends ServiceImpl<RijixinxiDao, RijixinxiEntity> implements RijixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RijixinxiEntity> page = this.selectPage(
                new Query<RijixinxiEntity>(params).getPage(),
                new EntityWrapper<RijixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RijixinxiEntity> wrapper) {
		  Page<RijixinxiView> page =new Query<RijixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RijixinxiVO> selectListVO(Wrapper<RijixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RijixinxiVO selectVO(Wrapper<RijixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RijixinxiView> selectListView(Wrapper<RijixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RijixinxiView selectView(Wrapper<RijixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
