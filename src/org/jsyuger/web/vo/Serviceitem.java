package org.jsyuger.web.vo;

/**
 * Serviceitem entity. @author MyEclipse Persistence Tools
 */

public class Serviceitem implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String type;
	private String color;
	private String timeConsuming;
	private Integer price;
	private String remark;
	private String service;

	// Constructors

	/** default constructor */
	public Serviceitem() {
	}

	/** minimal constructor */
	public Serviceitem(Integer id) {
		this.id = id;
	}
	
	/** full constructor ,lack of id*/
	public Serviceitem(String name, String type, String color,
			String timeConsuming, Integer price, String remark, String service) {
		this.name = name;
		this.type = type;
		this.color = color;
		this.timeConsuming = timeConsuming;
		this.price = price;
		this.remark = remark;
		this.service = service;
	}

	// Property accessors
	/** real full constructor */
	public Serviceitem(Integer id, String name, String type, String color,
			String timeConsuming, Integer price, String remark, String service) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name = name;
		this.type = type;
		this.color = color;
		this.timeConsuming = timeConsuming;
		this.price = price;
		this.remark = remark;
		this.service = service;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTimeConsuming() {
		return this.timeConsuming;
	}

	public void setTimeConsuming(String timeConsuming) {
		this.timeConsuming = timeConsuming;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

}