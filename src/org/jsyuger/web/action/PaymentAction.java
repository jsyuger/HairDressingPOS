package org.jsyuger.web.action;

import java.io.IOException;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;
import org.jsyuger.web.dao.PaymentDAO;
import org.jsyuger.web.service.PaymentService;

public class PaymentAction {
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
	private int number;
	
	PaymentService ps=new PaymentService();
	//通过产品名查找并且统计
	public String countPaymentByName() throws Exception{
		number=ps.countPaymentByName(getItemname());
		JSONArray json = JSONArray.fromObject(number);
        ServletActionContext.getResponse().getWriter().print(json);
		return null;
	}
	
	
	
	
	
	
	
	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public PaymentService getPs() {
		return ps;
	}



	public void setPs(PaymentService ps) {
		this.ps = ps;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getItemtype() {
		return itemtype;
	}
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getBaber() {
		return baber;
	}
	public void setBaber(String baber) {
		this.baber = baber;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getWorker() {
		return worker;
	}
	public void setWorker(String worker) {
		this.worker = worker;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
