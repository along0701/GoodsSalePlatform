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
	private String customerAddress;
	/**
	 * �˿����ԣ����Ϲ˿ͣ�
	 */
	private String customerAttr;
	/**
	 * �깺���
	 */
	private double buyQuto;
	
	public double getBuyQuto() {
		return buyQuto;
	}
	public void setBuyQuto(double buyQuto) {
		this.buyQuto = buyQuto;
	}
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
