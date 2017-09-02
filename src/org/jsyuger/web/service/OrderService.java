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
	
	
	//��ʵ����
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
	
	
	/*==============Ԥѡ����===========*/
	/*Ԥ�µ�*/
	public List<Serviceitem> addPreOrderService(Serviceitem s) {
		list.add(s);
		return list;
	}
	/*Ԥɾ��*/
	public boolean removePreOrderService(int index){
		return list.remove(index) != null;
	}
	/*Ԥ����ɾ��*/
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
