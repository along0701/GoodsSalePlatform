package com.goods.manage.impl;

import java.util.Date;

/**
 * �߲˲�Ʒ
 * @author zhangpanlong
 *
 */
public class VegetablesGoods extends Goods{
	/**
	 * �߲�����
	 */
	private String VegetablesCatgory;
	/**
	 * ������
	 */
	private Date guarantee;
	
	public String getVegetablesCatgory() {
		return VegetablesCatgory;
	}
	public void setVegetablesCatgory(String vegetablesCatgory) {
		VegetablesCatgory = vegetablesCatgory;
	}
	public Date getGuarantee() {
		return guarantee;
	}
	public void setGuarantee(Date guarantee) {
		this.guarantee = guarantee;
	}
	
	
}
