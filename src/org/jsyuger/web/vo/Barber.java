package org.jsyuger.web.vo;

/**
 * Barber entity. @author MyEclipse Persistence Tools
 */

public class Barber implements java.io.Serializable {

	// Fields

	private Integer id;
	private String barberName;
	private String barberService;
	private String barberPhone;
	private String barberImage;
	private String barberInfo;
	private String remark;

	// Constructors

	/** default constructor */
	public Barber() {
	}

	/** minimal constructor */
	public Barber(String barberName) {
		this.barberName = barberName;
	}

	/** full constructor */
	public Barber(String barberName, String barberService, String barberPhone,
			String barberImage, String barberInfo, String remark) {
		this.barberName = barberName;
		this.barberService = barberService;
		this.barberPhone = barberPhone;
		this.barberImage = barberImage;
		this.barberInfo = barberInfo;
		this.remark = remark;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBarberName() {
		return this.barberName;
	}

	public void setBarberName(String barberName) {
		this.barberName = barberName;
	}

	public String getBarberService() {
		return this.barberService;
	}

	public void setBarberService(String barberService) {
		this.barberService = barberService;
	}

	public String getBarberPhone() {
		return this.barberPhone;
	}

	public void setBarberPhone(String barberPhone) {
		this.barberPhone = barberPhone;
	}

	public String getBarberImage() {
		return this.barberImage;
	}

	public void setBarberImage(String barberImage) {
		this.barberImage = barberImage;
	}

	public String getBarberInfo() {
		return this.barberInfo;
	}

	public void setBarberInfo(String barberInfo) {
		this.barberInfo = barberInfo;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}