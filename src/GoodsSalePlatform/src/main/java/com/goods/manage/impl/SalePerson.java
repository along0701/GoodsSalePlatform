package com.goods.manage.impl;
/**
 * 售货员实体
 * @author zhangpanlong
 *
 */
public class SalePerson {
	/**
	 * 售货员名称
	 */
	private String salePersonName;
	/**
	 * 售货员编码
	 */
	private String salePersonNo;
	/**
	 * 售货区域
	 */
	private String saleArea;
	/**
	 * 销售级别（经理、总监、组长、普通员工）
	 */
	private int saleLeven;
	/**
	 * 年销售额度（万元）
	 */
	private double saleQuto;
	
	public double getSaleQuto() {
		return saleQuto;
	}
	public void setSaleQuto(double saleQuto) {
		this.saleQuto = saleQuto;
	}
	public int getSaleLeven() {
		return saleLeven;
	}
	public void setSaleLeven(int saleLeven) {
		this.saleLeven = saleLeven;
	}
	public String getSalePersonName() {
		return salePersonName;
	}
	public void setSalePersonName(String salePersonName) {
		this.salePersonName = salePersonName;
	}
	public String getSalePersonNo() {
		return salePersonNo;
	}
	public void setSalePersonNo(String salePersonNo) {
		this.salePersonNo = salePersonNo;
	}
	public String getSaleArea() {
		return saleArea;
	}
	public void setSaleArea(String saleArea) {
		this.saleArea = saleArea;
	}
	
	
	
}
