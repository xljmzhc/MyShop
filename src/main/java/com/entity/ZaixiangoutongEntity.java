package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 在线沟通
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-10 14:49:58
 */
@TableName("zaixiangoutong")
public class ZaixiangoutongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZaixiangoutongEntity() {
		
	}
	
	public ZaixiangoutongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 学生学号
	 */
					
	private String xueshengxuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 学校名称
	 */
					
	private String xuexiaomingcheng;
	
	/**
	 * 沟通人账号
	 */
					
	private String goutongrenzhanghao;
	
	/**
	 * 沟通人姓名
	 */
					
	private String goutongrenxingming;
	
	/**
	 * 商品图片
	 */
					
	private String shangpintupian;
	
	/**
	 * 联系标题
	 */
					
	private String lianxibiaoti;
	
	/**
	 * 联系时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date lianxishijian;
	
	/**
	 * 联系内容
	 */
					
	private String lianxineirong;
	
	/**
	 * 回复内容
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学生学号
	 */
	public void setXueshengxuehao(String xueshengxuehao) {
		this.xueshengxuehao = xueshengxuehao;
	}
	/**
	 * 获取：学生学号
	 */
	public String getXueshengxuehao() {
		return xueshengxuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：学校名称
	 */
	public void setXuexiaomingcheng(String xuexiaomingcheng) {
		this.xuexiaomingcheng = xuexiaomingcheng;
	}
	/**
	 * 获取：学校名称
	 */
	public String getXuexiaomingcheng() {
		return xuexiaomingcheng;
	}
	/**
	 * 设置：沟通人账号
	 */
	public void setGoutongrenzhanghao(String goutongrenzhanghao) {
		this.goutongrenzhanghao = goutongrenzhanghao;
	}
	/**
	 * 获取：沟通人账号
	 */
	public String getGoutongrenzhanghao() {
		return goutongrenzhanghao;
	}
	/**
	 * 设置：沟通人姓名
	 */
	public void setGoutongrenxingming(String goutongrenxingming) {
		this.goutongrenxingming = goutongrenxingming;
	}
	/**
	 * 获取：沟通人姓名
	 */
	public String getGoutongrenxingming() {
		return goutongrenxingming;
	}
	/**
	 * 设置：商品图片
	 */
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
	/**
	 * 设置：联系标题
	 */
	public void setLianxibiaoti(String lianxibiaoti) {
		this.lianxibiaoti = lianxibiaoti;
	}
	/**
	 * 获取：联系标题
	 */
	public String getLianxibiaoti() {
		return lianxibiaoti;
	}
	/**
	 * 设置：联系时间
	 */
	public void setLianxishijian(Date lianxishijian) {
		this.lianxishijian = lianxishijian;
	}
	/**
	 * 获取：联系时间
	 */
	public Date getLianxishijian() {
		return lianxishijian;
	}
	/**
	 * 设置：联系内容
	 */
	public void setLianxineirong(String lianxineirong) {
		this.lianxineirong = lianxineirong;
	}
	/**
	 * 获取：联系内容
	 */
	public String getLianxineirong() {
		return lianxineirong;
	}
	/**
	 * 设置：回复内容
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}

}
