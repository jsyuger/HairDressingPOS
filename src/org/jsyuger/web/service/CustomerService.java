package org.jsyuger.web.service;

import java.util.List;

import org.jsyuger.web.dao.CustomerDAO;
import org.jsyuger.web.dao.MemberRecordDAO;
import org.jsyuger.web.vo.Customer;
import org.jsyuger.web.vo.Memberrecord;

public class CustomerService {
	CustomerDAO c= new CustomerDAO();
	public List getRecordByPage(int page, int size){
		//通过分页+条件查用户列表（列表）
		List<Customer> recordList=c.listByPage(page,size);
		/*for (Customer tempRec : recordList) {
			System.out.println("id=="+tempRec.getId());
			System.out.println("理发师=="+tempRec.getBarber());
			System.out.println("姓名=="+tempRec.getCustomerName());
			System.out.println("备注=="+tempRec.getRemark());
			System.out.println("服务=="+tempRec.getService());
			System.out.println("时间=="+tempRec.getTime());
			System.out.println("花费=="+tempRec.getMoney());
		}*/
		return recordList;
	}
	
	//获得所有记录的条目总数
	public int getTotalById(){
		return c.countRecord();
	}
}
