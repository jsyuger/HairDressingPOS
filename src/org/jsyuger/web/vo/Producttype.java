package org.jsyuger.web.vo;

/**
 * Producttype entity. @author MyEclipse Persistence Tools
 */

public class Producttype implements java.io.Serializable {

	// Fields

	private ProducttypeId id;
	private String typename;
	private String remark;

	// Constructors

	/** default constructor */
	public Producttype() {
	}

	/** minimal constructor */
	public Producttype(ProducttypeId id) {
		this.id = id;
	}

	/** full constructor */
	public Producttype(ProducttypeId id, String typename, String remark) {
		this.id = id;
		this.typename = typename;
		this.remark = remark;
	}

	// Property accessors

	public ProducttypeId getId() {
		return this.id;
	}

	public void setId(ProducttypeId id) {
		this.id = id;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}