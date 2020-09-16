package com.goods.manage.impl;

import java.util.Date;

/**
 * 酸奶商品
 * @author zhangpanlong
 *
 */
public class YogurtGoods extends Goods {
	/**
	 * 奶源
	 */
	private String milkSource;
	/**
	 * 保质期
	 */
	private Date guarantee;
	
	/**
	 * 优惠
	 */
	private String discount;
	
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	public String getMilkSource() {
		return milkSource;
	}
	public void setMilkSource(String milkSource) {
		this.milkSource = milkSource;
	}
	public Date getGuarantee() {
		return guarantee;
	}
	public void setGuarantee(Date guarantee) {
		this.guarantee = guarantee;
	}
	
	
}
