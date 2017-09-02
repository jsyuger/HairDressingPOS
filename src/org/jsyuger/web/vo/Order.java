package org.jsyuger.web.vo;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer id;
	private String time;
	private String barber;
	private String service;
	private Integer money;
	private String phone;
	private String remark;
	private String itemtype;
	private String itemname;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(String time) {
		this.time = time;
	}

	/** full constructor */
	public Order(String time, String barber, String service, Integer money,
			String phone, String remark, String itemtype, String itemname) {
		this.time = time;
		this.barber = barber;
		this.service = service;
		this.money = money;
		this.phone = phone;
		this.remark = remark;
		this.itemtype = itemtype;
		this.itemname = itemname;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getBarber() {
		return this.barber;
	}

	public void setBarber(String barber) {
		this.barber = barber;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getItemtype() {
		return this.itemtype;
	}

	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

}