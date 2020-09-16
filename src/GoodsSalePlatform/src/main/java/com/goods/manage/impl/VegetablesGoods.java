package com.goods.manage.impl;

import java.util.Date;

/**
 * 蔬菜产品
 * @author zhangpanlong
 *
 */
public class VegetablesGoods extends Goods{
	/**
	 * 蔬菜种类
	 */
	private String VegetablesCatgory;
	/**
	 * 保质期
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
