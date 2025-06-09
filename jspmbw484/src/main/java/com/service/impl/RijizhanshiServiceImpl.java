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


import com.dao.RijizhanshiDao;
import com.entity.RijizhanshiEntity;
import com.service.RijizhanshiService;
import com.entity.vo.RijizhanshiVO;
import com.entity.view.RijizhanshiView;

@Service("rijizhanshiService")
public class RijizhanshiServiceImpl extends ServiceImpl<RijizhanshiDao, RijizhanshiEntity> implements RijizhanshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RijizhanshiEntity> page = this.selectPage(
                new Query<RijizhanshiEntity>(params).getPage(),
                new EntityWrapper<RijizhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RijizhanshiEntity> wrapper) {
		  Page<RijizhanshiView> page =new Query<RijizhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RijizhanshiVO> selectListVO(Wrapper<RijizhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RijizhanshiVO selectVO(Wrapper<RijizhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RijizhanshiView> selectListView(Wrapper<RijizhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RijizhanshiView selectView(Wrapper<RijizhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
