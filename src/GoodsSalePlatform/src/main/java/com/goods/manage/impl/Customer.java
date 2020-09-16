package com.goods.manage.impl;
/**
 * 顾客实体类
 * @author zhangpanlong
 *
 */
public class Customer {
	/**
	 * 顾客名称
	 */
	private String customerName;
	/**
	 * 顾客编码
	 */
	private String customerNo;
	/**
	 * 顾客地址
	 */
	private String customerRealAddress;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerRealAddress() {
		return customerRealAddress;
	}
	public void setCustomerRealAddress(String customerRealAddress) {
		this.customerRealAddress = customerRealAddress;
	}
}
