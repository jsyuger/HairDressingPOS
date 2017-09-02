package org.jsyuger.web.service;

import java.util.List;

import org.jsyuger.web.dao.ServiceItemDAO;
import org.jsyuger.web.vo.Serviceitem;

public class ServiceItemService {
	ServiceItemDAO item=new ServiceItemDAO();
	
	//search all
	public List showItemService(){
		List<Serviceitem> recordList=item.list();
		return recordList;
	}
	
	//search one kind
	public List showOneKindItemService(String service){
		List<Serviceitem> recordList=item.listOneKind(service);
		return recordList;
	}
	
	
	//add
	public boolean addItemService(Serviceitem si) throws Exception{
		if(si.getName()!=null&&!(si.getName().equals("")))
			return item.addServiceItem(si);
		else 
			return false;
	}
	
	//update
	public boolean editItemService(Serviceitem si){
		return item.updateServiceItem(si);
	}
	
	//delete
	public boolean deleteItemService(Serviceitem si){
		return item.deleteServiceItem(si);
	}
	
	//search one kind by attribute
	public List showOneKindItemServiceByColor(String service,String color){
		List<Serviceitem> recordList=item.listOneKindByColor(service, color);
		return recordList;
	}
	public List showOneKindItemServiceByType(String service,String type){
		List<Serviceitem> recordList=item.listOneKindByType(service, type);
		return recordList;
	}
	public List showOneKindItemServiceByTimeConsuming(String service,String t){
		List<Serviceitem> recordList=item.listOneKindByTimeConsuming(service, t);
		return recordList;
	}
	public List showOneKindItemServiceByPrice(String service,String price){
		List<Serviceitem> recordList=item.listOneKindByPrice(service, price);
		return recordList;
	}
}
