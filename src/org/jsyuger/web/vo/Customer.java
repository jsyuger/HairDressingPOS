package org.jsyuger.web.vo;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer id;
	private String customerName;
	private String time;
	private String service;
	private String barber;
	private Double money;
	private String remark;

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(String customerName, String time, String service,
			String barber, Double money) {
		this.customerName = customerName;
		this.time = time;
		this.service = service;
		this.barber = barber;
		this.money = money;
	}

	/** full constructor */
	public Customer(String customerName, String time, String service,
			String barber, Double money, String remark) {
		this.customerName = customerName;
		this.time = time;
		this.service = service;
		this.barber = barber;
		this.money = money;
		this.remark = remark;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getBarber() {
		return this.barber;
	}

	public void setBarber(String barber) {
		this.barber = barber;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}