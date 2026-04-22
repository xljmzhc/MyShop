package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZaixiangoutongEntity;
import com.entity.view.ZaixiangoutongView;

import com.service.ZaixiangoutongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 在线沟通
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-10 14:49:58
 */
@RestController
@RequestMapping("/zaixiangoutong")
public class ZaixiangoutongController {
    @Autowired
    private ZaixiangoutongService zaixiangoutongService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZaixiangoutongEntity zaixiangoutong,
		HttpServletRequest request){
        EntityWrapper<ZaixiangoutongEntity> ew = new EntityWrapper<ZaixiangoutongEntity>();

        String tableName = request.getSession().getAttribute("tableName").toString();
        ew.andNew();
        if(tableName.equals("xuesheng")) {
            ew.eq("xueshengxuehao", (String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("xuesheng")) {
            ew.or();
            ew.eq("goutongrenzhanghao", (String)request.getSession().getAttribute("username"));
        }
        ew.andNew("1=1");
		PageUtils page = zaixiangoutongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaixiangoutong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZaixiangoutongEntity zaixiangoutong, 
		HttpServletRequest request){
        EntityWrapper<ZaixiangoutongEntity> ew = new EntityWrapper<ZaixiangoutongEntity>();

		PageUtils page = zaixiangoutongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaixiangoutong), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZaixiangoutongEntity zaixiangoutong){
       	EntityWrapper<ZaixiangoutongEntity> ew = new EntityWrapper<ZaixiangoutongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zaixiangoutong, "zaixiangoutong")); 
        return R.ok().put("data", zaixiangoutongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZaixiangoutongEntity zaixiangoutong){
        EntityWrapper< ZaixiangoutongEntity> ew = new EntityWrapper< ZaixiangoutongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zaixiangoutong, "zaixiangoutong")); 
		ZaixiangoutongView zaixiangoutongView =  zaixiangoutongService.selectView(ew);
		return R.ok("查询在线沟通成功").put("data", zaixiangoutongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZaixiangoutongEntity zaixiangoutong = zaixiangoutongService.selectById(id);
        return R.ok().put("data", zaixiangoutong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZaixiangoutongEntity zaixiangoutong = zaixiangoutongService.selectById(id);
        return R.ok().put("data", zaixiangoutong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZaixiangoutongEntity zaixiangoutong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zaixiangoutong);
        zaixiangoutongService.insert(zaixiangoutong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZaixiangoutongEntity zaixiangoutong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zaixiangoutong);
        zaixiangoutongService.insert(zaixiangoutong);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZaixiangoutongEntity zaixiangoutong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zaixiangoutong);
        zaixiangoutongService.updateById(zaixiangoutong);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zaixiangoutongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
