package org.jsyuger.web.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.jsyuger.web.service.OrderService;
import org.jsyuger.web.service.ServiceRecommendService;
import org.jsyuger.web.vo.Serviceitem;

import com.opensymphony.xwork2.ActionContext;


/**
 * 预处理类，主要针对于下单操作
 * @author Administrator
 *
 */
public class ProcessControllAction {
	private String service;
	private String name;
	private String type;
	private String color;
	private String timeConsuming;
	private Integer price;
	private String remark;
	
	private int index;
	
	//处理预选
	public String addPreOrder(){
//		SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
//   	 	String time=df.format(new Date());
   	 	Serviceitem serviceitem=new Serviceitem(getName(),getType(),
				getColor(),getTimeConsuming(),getPrice(),getRemark(),getService());
		
		List preList=OrderService.getInstance().addPreOrderService(serviceitem);
		
		Iterator it=preList.iterator();
		System.out.println("-------------");
		while(it.hasNext()){
			Serviceitem s=(Serviceitem)it.next();
			System.out.println(s.getRemark()+s.getName()+s.getType()+
					s.getColor()+s.getTimeConsuming()+s.getPrice()+s.getService());
		}
		System.out.println("-------------");
		
		ServiceRecommendService srs=new ServiceRecommendService();
		List recommend=srs.showRecommendService();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("prelist", preList);
		request.put("recommend", recommend);
		//return "success";
		return null;
	}
	
	public String removePreOrder(){
		/*
		Serviceitem serviceitem=new Serviceitem(getName(),getType(),
				getColor(),getTimeConsuming(),getPrice(),getRemark(),getService());
		System.out.print(getName()+getType()+
				getColor()+getTimeConsuming()+getPrice()+getRemark()+getService());
		boolean boo=OrderService.getInstance().removePreOrderService(serviceitem);
		*/
		boolean boo=OrderService.getInstance().removePreOrderService(getIndex());
		System.out.print(boo);
		return show();
	}
		
	public String removeAllPreOrder(){
		return "success";
	}
		
	public String show(){
		List preList=OrderService.getInstance().getList();
		ServiceRecommendService srs=new ServiceRecommendService();
		List recommend=srs.showRecommendService();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("prelist", preList);
		request.put("recommend", recommend);
		return "success";
	}
	
	
		
		public String getService() {
			return service;
		}

		public void setService(String service) {
			this.service = service;
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

		public String getRemark() {
			return remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}
		

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}


		
}
