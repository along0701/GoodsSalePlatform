package com.goods.manage.impl;

import java.util.Date;

/**
 * ������Ʒ
 * @author zhangpanlong
 *
 */
public class YogurtGoods extends Goods {
	/**
	 * ��Դ
	 */
	private String milkSource;
	/**
	 * ������
	 */
	private Date guarantee;
	
	/**
	 * �Ż�
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
