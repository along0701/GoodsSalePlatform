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
	private String goodsAttr;
	/**
	 * 年销售额（万元）
	 */
	private double saleQuto;
	
	public double getSaleQuto() {
		return saleQuto;
	}
	public void setSaleQuto(double saleQuto) {
		this.saleQuto = saleQuto;
	}
	public String getGoodsAttr() {
		return goodsAttr;
	}
	public void setGoodsAttr(String goodsAttr) {
		this.goodsAttr = goodsAttr;
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
