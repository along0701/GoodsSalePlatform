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
	private String customerAddress;
	/**
	 * 顾客属性（新老顾客）
	 */
	private String customerAttr;
	
	public String getCustomerAttr() {
		return customerAttr;
	}
	public void setCustomerAttr(String customerAttr) {
		this.customerAttr = customerAttr;
	}
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
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
	
}
