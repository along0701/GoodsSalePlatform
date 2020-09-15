package com.goods.manage.impl;
/**
 * 商品实体类
 * @author zhangpanlong
 *
 */
public class Goods {
	/**
	 * 商品名称
	 */
	private String goodsName;
	/**
	 * 商品编码
	 */
	private String goodsNo;
	/**
	 * 商品价格
	 */
	private double goodsPrice;
	/**
	 * 商品属性
	 */
	private String goodsProp;
	
	public String getGoodsProp() {
		return goodsProp;
	}
	public void setGoodsProp(String goodsProp) {
		this.goodsProp = goodsProp;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsNo() {
		return goodsNo;
	}
	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}
	public double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	
	
	
}
