package org.jsyuger.web.vo;

import java.sql.Timestamp;

/**
 * Card entity. @author MyEclipse Persistence Tools
 */

public class Card implements java.io.Serializable {

	// Fields

	private Integer id;
	private String cardNum;
	private Double cardBalance;
	private Timestamp createDate;

	// Constructors

	/** default constructor */
	public Card() {
	}

	/** full constructor */
	public Card(String cardNum, Double cardBalance, Timestamp createDate) {
		this.cardNum = cardNum;
		this.cardBalance = cardBalance;
		this.createDate = createDate;
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

	public Double getCardBalance() {
		return this.cardBalance;
	}

	public void setCardBalance(Double cardBalance) {
		this.cardBalance = cardBalance;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

}