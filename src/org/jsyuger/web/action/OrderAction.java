package org.jsyuger.web.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.jsyuger.web.service.OrderService;
import org.jsyuger.web.vo.Order;
import org.jsyuger.web.vo.Serviceitem;

import com.opensymphony.xwork2.ActionContext;

public class OrderAction {
	private Integer id;
	private String time;
	private String barber;
	private String service;
	private Integer money;
	private String phone;
	private String remark;
	private String itemtype;
	private String itemname;
	
	//private OrderService os=new OrderService();

	private List<Order> pre=new ArrayList<Order>();
	
	//add
	public void addOrder(){
		Order order=new Order(time,getBarber(),getService(),
				getMoney(),getPhone(),getRemark(),getItemtype(),getItemname());
	}
	//delete
	
	//search
	
	
	
	
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

	public String getBarber() {
		return barber;
	}

	public void setBarber(String barber) {
		this.barber = barber;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

//	public OrderService getOs() {
//		return os;
//	}
//
//	public void setOs(OrderService os) {
//		this.os = os;
//	}

	public List<Order> getPre() {
		return pre;
	}

	public void setPre(List<Order> pre) {
		this.pre = pre;
	}

}
