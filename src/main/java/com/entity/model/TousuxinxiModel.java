package com.entity.model;

import com.entity.TousuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 投诉信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-03-10 14:49:58
 */
public class TousuxinxiModel  implements Serializable {
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
	 * 投诉人账号
	 */
	
	private String tousurenzhanghao;
		
	/**
	 * 投诉人姓名
	 */
	
	private String tousurenxingming;
		
	/**
	 * 投诉图片
	 */
	
	private String tousutupian;
		
	/**
	 * 投诉时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tousushijian;
		
	/**
	 * 投诉内容
	 */
	
	private String tousuneirong;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
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
	 * 设置：投诉人账号
	 */
	 
	public void setTousurenzhanghao(String tousurenzhanghao) {
		this.tousurenzhanghao = tousurenzhanghao;
	}
	
	/**
	 * 获取：投诉人账号
	 */
	public String getTousurenzhanghao() {
		return tousurenzhanghao;
	}
				
	
	/**
	 * 设置：投诉人姓名
	 */
	 
	public void setTousurenxingming(String tousurenxingming) {
		this.tousurenxingming = tousurenxingming;
	}
	
	/**
	 * 获取：投诉人姓名
	 */
	public String getTousurenxingming() {
		return tousurenxingming;
	}
				
	
	/**
	 * 设置：投诉图片
	 */
	 
	public void setTousutupian(String tousutupian) {
		this.tousutupian = tousutupian;
	}
	
	/**
	 * 获取：投诉图片
	 */
	public String getTousutupian() {
		return tousutupian;
	}
				
	
	/**
	 * 设置：投诉时间
	 */
	 
	public void setTousushijian(Date tousushijian) {
		this.tousushijian = tousushijian;
	}
	
	/**
	 * 获取：投诉时间
	 */
	public Date getTousushijian() {
		return tousushijian;
	}
				
	
	/**
	 * 设置：投诉内容
	 */
	 
	public void setTousuneirong(String tousuneirong) {
		this.tousuneirong = tousuneirong;
	}
	
	/**
	 * 获取：投诉内容
	 */
	public String getTousuneirong() {
		return tousuneirong;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
