package org.jsyuger.web.action;

import java.util.List;
import java.util.Map;

import org.jsyuger.web.dao.BaseDAO;
import org.jsyuger.web.service.ServiceRecommendService;
import org.jsyuger.web.vo.Servicerecommend;

import com.opensymphony.xwork2.ActionContext;

public class ServiceRecommendAction {
	private Integer id;
	private String name;
	private String type;
	private String color;
	private String timeConsuming;
	private Integer prePrice;
	private Integer price;
	private String service;
	private String remark;
	
	private ServiceRecommendService srs=new ServiceRecommendService();
	
	//show
	public String showall(){
		List recommend=srs.showRecommendService();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("recommend", recommend);
		return "success";
	}
	
	
	//add
	public String addRecommend() throws Exception{
		Servicerecommend servicerecommend=new Servicerecommend(getName(),getType(),
				getColor(),getTimeConsuming(),getPrePrice(),getPrice(),getService(),getRemark());
		//test
		System.out.println(getName()+getType()+
				getColor()+getTimeConsuming()+getPrePrice()+getPrice()+getService()+getRemark());
		
		srs.addRecommendService(servicerecommend);
		
		List recommend=srs.showRecommendService();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("recommend", recommend);
		return "success";
	}
	
	//update
	public String editRecommend(){
		Servicerecommend servicerecommend=new Servicerecommend(getId(),getName(),getType(),
				getColor(),getTimeConsuming(),getPrePrice(),getPrice(),getService(),getRemark());
		//test
		System.out.println(getId()+getName()+getType()+
				getColor()+getTimeConsuming()+getPrePrice()+getPrice()+getService()+getRemark());
		
		srs.editRecommendService(servicerecommend);
		
		List recommend=srs.showRecommendService();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("recommend", recommend);
		return "success";
	}
	
	//delete
	public String deleteRecommend(){
		Servicerecommend servicerecommend=new Servicerecommend(getId());
		srs.deleteRecommendService(servicerecommend);
		
		List recommend=srs.showRecommendService();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("recommend", recommend);
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

	public Integer getPrePrice() {
		return prePrice;
	}

	public void setPrePrice(Integer prePrice) {
		this.prePrice = prePrice;
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
