package com.goods.manage.impl;
/**
 * �˿�ʵ����
 * @author zhangpanlong
 *
 */
public class Customer {
	/**
	 * �˿�����
	 */
	private String customerName;
	/**
	 * �˿ͱ���
	 */
	private String customerNo;
	/**
	 * �˿͵�ַ
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
