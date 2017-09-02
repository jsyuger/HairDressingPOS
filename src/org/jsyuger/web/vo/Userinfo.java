package org.jsyuger.web.vo;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private String phone;
	private String address;
	private String sex;
	private Integer age;
	private String img;
	private String remark;

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** minimal constructor */
	public Userinfo(Integer id, User user) {
		this.id = id;
		this.user = user;
	}
	
	/** non-id constructor */
	public Userinfo(User user, String phone, String address,
			String sex, Integer age, String img, String remark) {
		this.user = user;
		this.phone = phone;
		this.address = address;
		this.sex = sex;
		this.age = age;
		this.img = img;
		this.remark = remark;
	}

	/** full constructor */
	public Userinfo(Integer id, User user, String phone, String address,
			String sex, Integer age, String img, String remark) {
		this.id = id;
		this.user = user;
		this.phone = phone;
		this.address = address;
		this.sex = sex;
		this.age = age;
		this.img = img;
		this.remark = remark;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}