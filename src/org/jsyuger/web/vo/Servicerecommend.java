package org.jsyuger.web.vo;

/**
 * Servicerecommend entity. @author MyEclipse Persistence Tools
 */

public class Servicerecommend implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String type;
	private String color;
	private String timeConsuming;
	private Integer prePrice;
	private Integer price;
	private String service;
	private String remark;

	// Constructors

	/** default constructor */
	public Servicerecommend() {
	}

	/** minimal constructor */
	public Servicerecommend(Integer id) {
		this.id = id;
	}
	
	/** non-id minimal constructor */
	public Servicerecommend(String name, String type, String color,
			String timeConsuming, Integer prePrice, Integer price, String service,
			String remark) {
		this.name = name;
		this.type = type;
		this.color = color;
		this.timeConsuming = timeConsuming;
		this.prePrice = prePrice;
		this.price = price;
		this.service = service;
		this.remark = remark;
	}

	/** full constructor */
	public Servicerecommend(Integer id, String name, String type, String color,
			String timeConsuming, Integer prePrice, Integer price, String service,
			String remark) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.color = color;
		this.timeConsuming = timeConsuming;
		this.prePrice = prePrice;
		this.price = price;
		this.service = service;
		this.remark = remark;
	}

	// Property accessors

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

	public Integer getPrePrice() {
		return this.prePrice;
	}

	public void setPrePrice(Integer prePrice) {
		this.prePrice = prePrice;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}