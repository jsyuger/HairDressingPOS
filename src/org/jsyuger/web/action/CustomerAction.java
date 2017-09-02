package org.jsyuger.web.action;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;
import org.jsyuger.web.service.CustomerService;
import org.jsyuger.web.util.Pager;

import com.opensymphony.xwork2.ActionContext;

public class CustomerAction {
	private int currentPage=1;
	private int inputnumber=3;
	
	//private Pager pager;
	CustomerService customerService=new CustomerService();
	
	//show all by page 
	public String showByPage() throws Exception{
		int totalSize=customerService.getTotalById();
		Pager pager=new Pager(currentPage,totalSize);
		pager.setPageSize(getInputnumber());
		List cs=customerService.getRecordByPage(currentPage,pager.getPageSize());
		
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("customers", cs);
		request.put("pager", pager);
        
		return "success";
	}
	
	//show all by page changed
	public String showByPageChange() throws Exception{
		int totalSize=customerService.getTotalById();
		Pager pager=new Pager(1,totalSize);
		pager.setPageSize(getInputnumber());
		System.out.println(inputnumber+"  "+pager.getPageSize());
		List cs=customerService.getRecordByPage(1,pager.getPageSize());
		
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("customers", cs);
		request.put("pager", pager);
     
		return "success";
	}
	
	
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public int getInputnumber() {
		return inputnumber;
	}


	public void setInputnumber(int inputnumber) {
		this.inputnumber = inputnumber;
	}


}
