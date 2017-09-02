package org.jsyuger.web.vo;

/**
 * ProducttypeId entity. @author MyEclipse Persistence Tools
 */

public class ProducttypeId implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer typeid;

	// Constructors

	/** default constructor */
	public ProducttypeId() {
	}

	/** full constructor */
	public ProducttypeId(Integer id, Integer typeid) {
		this.id = id;
		this.typeid = typeid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProducttypeId))
			return false;
		ProducttypeId castOther = (ProducttypeId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getTypeid() == castOther.getTypeid()) || (this
						.getTypeid() != null && castOther.getTypeid() != null && this
						.getTypeid().equals(castOther.getTypeid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getTypeid() == null ? 0 : this.getTypeid().hashCode());
		return result;
	}

}