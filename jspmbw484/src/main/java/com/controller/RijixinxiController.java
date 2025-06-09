package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.RijixinxiEntity;
import com.entity.view.RijixinxiView;

import com.service.RijixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 日记信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-28 15:33:25
 */
@RestController
@RequestMapping("/rijixinxi")
public class RijixinxiController {
    @Autowired
    private RijixinxiService rijixinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RijixinxiEntity rijixinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			rijixinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RijixinxiEntity> ew = new EntityWrapper<RijixinxiEntity>();
    	PageUtils page = rijixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, rijixinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RijixinxiEntity rijixinxi, HttpServletRequest request){
        EntityWrapper<RijixinxiEntity> ew = new EntityWrapper<RijixinxiEntity>();
    	PageUtils page = rijixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, rijixinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RijixinxiEntity rijixinxi){
       	EntityWrapper<RijixinxiEntity> ew = new EntityWrapper<RijixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( rijixinxi, "rijixinxi")); 
        return R.ok().put("data", rijixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RijixinxiEntity rijixinxi){
        EntityWrapper< RijixinxiEntity> ew = new EntityWrapper< RijixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( rijixinxi, "rijixinxi")); 
		RijixinxiView rijixinxiView =  rijixinxiService.selectView(ew);
		return R.ok("查询日记信息成功").put("data", rijixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RijixinxiEntity rijixinxi = rijixinxiService.selectById(id);
        return R.ok().put("data", rijixinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RijixinxiEntity rijixinxi = rijixinxiService.selectById(id);
        return R.ok().put("data", rijixinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        RijixinxiEntity rijixinxi = rijixinxiService.selectById(id);
        if(type.equals("1")) {
        	rijixinxi.setThumbsupnum(rijixinxi.getThumbsupnum()+1);
        } else {
        	rijixinxi.setCrazilynum(rijixinxi.getCrazilynum()+1);
        }
        rijixinxiService.updateById(rijixinxi);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RijixinxiEntity rijixinxi, HttpServletRequest request){
    	rijixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(rijixinxi);

        rijixinxiService.insert(rijixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody RijixinxiEntity rijixinxi, HttpServletRequest request){
    	rijixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(rijixinxi);

        rijixinxiService.insert(rijixinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RijixinxiEntity rijixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(rijixinxi);
        rijixinxiService.updateById(rijixinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        rijixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<RijixinxiEntity> wrapper = new EntityWrapper<RijixinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = rijixinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
