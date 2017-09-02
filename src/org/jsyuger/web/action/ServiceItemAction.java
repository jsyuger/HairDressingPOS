package org.jsyuger.web.action;

import java.util.List;
import java.util.Map;

import org.jsyuger.web.service.ServiceItemService;
import org.jsyuger.web.vo.Serviceitem;


import com.opensymphony.xwork2.ActionContext;

public class ServiceItemAction {
	private Integer id;
	private String name;
	private String type;
	private String color;
	private String timeConsuming;
	private Integer price;
	private String service;
	private String remark;
	
	
	private ServiceItemService sis=new ServiceItemService();
	
	//show all
	public String showall(){
		List items=sis.showItemService();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("items", items);
		return "success";
	}
	
	//show one kind
	public String showOneKind(){
		List items=sis.showOneKindItemService(getService());
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("items", items);
		return "success";
	}
	
	//add
	public String addServiceItem() throws Exception{
		Serviceitem serviceitem=new Serviceitem(getName(),getType(),
				getColor(),getTimeConsuming(),getPrice(),getRemark(),getService());
		//test
		System.out.println(getName()+getType()+
				getColor()+getTimeConsuming()+getPrice()+getService()+getRemark());
		
		sis.addItemService(serviceitem);
		
		List items=sis.showOneKindItemService(getService());
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("items", items);
		return "success";
	}
	
	//update
	public String editServiceItem(){
		Serviceitem serviceitem=new Serviceitem(getId(),getName(),getType(),
				getColor(),getTimeConsuming(),getPrice(),getRemark(),getService());
		//test
		System.out.println(getId()+getName()+getType()+
				getColor()+getTimeConsuming()+getPrice()+getService()+getRemark());
		
		sis.editItemService(serviceitem);
		
		List items=sis.showOneKindItemService(getService());
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("items", items);
		return "success";
	}
	
	//delete
	public String deleteServiceItem(){
		Serviceitem serviceitem=new Serviceitem(getId());
		sis.deleteItemService(serviceitem);
		
		List items=sis.showOneKindItemService(getService());
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("items", items);
		return "success";
	}
	
	
	/*=====show one kind by attribute======*/
	public String showOneKindByColor(){
		List items=sis.showOneKindItemServiceByColor(getService(), getColor());
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("items", items);
		return "success";
	}
	
	public String showOneKindByType(){
		List items=sis.showOneKindItemServiceByType(getService(), getType());
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("items", items);
		return "success";
	}
	
	public String showOneKindByTimeConsuming(){
		List items=sis.showOneKindItemServiceByTimeConsuming(getService(), getTimeConsuming());
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("items", items);
		return "success";
	}
	
	public String showOneKindByPrice(){
		String p=getPrice().toString();
		List items=sis.showOneKindItemServiceByPrice(getService(), p);
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("items", items);
		return "success";
	}
			
			
			
			
			
			
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTimeConsuming() {
		return timeConsuming;
	}
	public void setTimeConsuming(String timeConsuming) {
		this.timeConsuming = timeConsuming;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
