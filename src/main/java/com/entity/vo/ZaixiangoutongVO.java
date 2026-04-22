package com.entity.vo;

import com.entity.ZaixiangoutongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 在线沟通
 * @author 
 * @email 
 * @date 2024-03-10 14:49:58
 */
public class ZaixiangoutongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
