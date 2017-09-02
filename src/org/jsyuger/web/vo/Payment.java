package org.jsyuger.web.vo;

/**
 * Payment entity. @author MyEclipse Persistence Tools
 */

public class Payment implements java.io.Serializable {

	// Fields

	private Integer id;
	private String time;
	private String service;
	private String itemtype;
	private String itemname;
	private String baber;
	private Integer money;
	private String phone;
	private String discount;
	private String worker;
	private String remark;

	// Constructors

	/** default constructor */
	public Payment() {
	}

	/** minimal constructor */
	public Payment(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Payment(Integer id, String time, String service, String itemtype,
			String itemname, String baber, Integer money, String phone,
			String discount, String worker, String remark) {
		this.id = id;
		this.time = time;
		this.service = service;
		this.itemtype = itemtype;
		this.itemname = itemname;
		this.baber = baber;
		this.money = money;
		this.phone = phone;
		this.discount = discount;
		this.worker = worker;
		this.remark = remark;
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

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
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

	public String getBaber() {
		return this.baber;
	}

	public void setBaber(String baber) {
		this.baber = baber;
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

	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getWorker() {
		return this.worker;
	}

	public void setWorker(String worker) {
		this.worker = worker;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}