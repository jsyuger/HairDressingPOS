package org.jsyuger.web.service;

import java.util.ArrayList;
import java.util.List;

import org.jsyuger.web.dao.BaseDAO;
import org.jsyuger.web.dao.OrderDAO;
import org.jsyuger.web.vo.Customer;
import org.jsyuger.web.vo.Order;
import org.jsyuger.web.vo.Serviceitem;

public class OrderService {

	private OrderDAO o=new OrderDAO();
	//pre
	private List<Serviceitem> list=new ArrayList<Serviceitem>();
	
	
	//单实例类
	private static OrderService instance;
	public static synchronized OrderService getInstance(){
		if(instance==null){
			instance=new OrderService();
		}
		return instance;
	}
	
	
	//add
	
	//delete
	
	//search
	
	
	/*==============预选处理===========*/
	/*预下单*/
	public List<Serviceitem> addPreOrderService(Serviceitem s) {
		list.add(s);
		return list;
	}
	/*预删除*/
	public boolean removePreOrderService(int index){
		return list.remove(index) != null;
	}
	/*预批量删除*/
	public boolean removeAllPreOrderService(){
		return list.removeAll(getList());
	}

	
	
	public List<Serviceitem> getList() {
		return list;
	}


	public void setList(List<Serviceitem> list) {
		this.list = list;
	}
}
