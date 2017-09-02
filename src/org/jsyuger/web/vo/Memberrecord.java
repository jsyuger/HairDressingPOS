package org.jsyuger.web.vo;

import java.sql.Timestamp;

/**
 * Memberrecord entity. @author MyEclipse Persistence Tools
 */

public class Memberrecord implements java.io.Serializable {

	// Fields

	private Integer id;
	private String cardNum;
	private String name;
	private Double cost;
	private Timestamp time;
	private String service;
	private String remark;
	private String barber;

	// Constructors

	/** default constructor */
	public Memberrecord() {
	}

	/** minimal constructor */
	public Memberrecord(Integer id, String cardNum, String name, Double cost,
			Timestamp time, String service,String barber) {
		this.id = id;
		this.cardNum = cardNum;
		this.name = name;
		this.cost = cost;
		this.time = time;
		this.service = service;
		this.barber = barber;
	}
	
	/** non-id full constructor */
	public Memberrecord(String cardNum, String name, Double cost,
			Timestamp time, String service, String remark,String barber) {
		this.cardNum = cardNum;
		this.name = name;
		this.cost = cost;
		this.time = time;
		this.service = service;
		this.remark = remark;
		this.barber = barber;
		
	}
	
	/** full constructor */
	public Memberrecord(Integer id, String cardNum, String name, Double cost,
			Timestamp time, String service, String remark,String barber) {
		this.id = id;
		this.cardNum = cardNum;
		this.name = name;
		this.cost = cost;
		this.time = time;
		this.service = service;
		this.remark = remark;
		this.barber = barber;
		
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCardNum() {
		return this.cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
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
	
	public String getBarber() {
		return barber;
	}

	public void setBarber(String barber) {
		this.barber = barber;
	}


}