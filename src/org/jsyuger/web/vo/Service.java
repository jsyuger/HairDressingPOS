package org.jsyuger.web.vo;

/**
 * Service entity. @author MyEclipse Persistence Tools
 */

public class Service implements java.io.Serializable {

	// Fields

	private Integer id;
	private String serviceName;
	private Integer servicePrice;
	private String serviceBarber;
	private String remark;

	// Constructors

	/** default constructor */
	public Service() {
	}

	/** minimal constructor */
	public Service(String serviceName, Integer servicePrice,
			String serviceBarber) {
		this.serviceName = serviceName;
		this.servicePrice = servicePrice;
		this.serviceBarber = serviceBarber;
	}

	/** full constructor */
	public Service(String serviceName, Integer servicePrice,
			String serviceBarber, String remark) {
		this.serviceName = serviceName;
		this.servicePrice = servicePrice;
		this.serviceBarber = serviceBarber;
		this.remark = remark;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Integer getServicePrice() {
		return this.servicePrice;
	}

	public void setServicePrice(Integer servicePrice) {
		this.servicePrice = servicePrice;
	}

	public String getServiceBarber() {
		return this.serviceBarber;
	}

	public void setServiceBarber(String serviceBarber) {
		this.serviceBarber = serviceBarber;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}