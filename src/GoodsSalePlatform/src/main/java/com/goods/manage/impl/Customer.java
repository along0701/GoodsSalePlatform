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
	private String customerFictAddress;
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
	public String getCustomerFictAddress() {
		return customerFictAddress;
	}
	public void setCustomerFictAddress(String customerFictAddress) {
		this.customerFictAddress = customerFictAddress;
	}
}
