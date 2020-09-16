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
