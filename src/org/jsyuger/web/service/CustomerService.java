package org.jsyuger.web.service;

import java.util.List;

import org.jsyuger.web.dao.CustomerDAO;
import org.jsyuger.web.dao.MemberRecordDAO;
import org.jsyuger.web.vo.Customer;
import org.jsyuger.web.vo.Memberrecord;

public class CustomerService {
	CustomerDAO c= new CustomerDAO();
	public List getRecordByPage(int page, int size){
		//ͨ����ҳ+�������û��б��б�
		List<Customer> recordList=c.listByPage(page,size);
		/*for (Customer tempRec : recordList) {
			System.out.println("id=="+tempRec.getId());
			System.out.println("��ʦ=="+tempRec.getBarber());
			System.out.println("����=="+tempRec.getCustomerName());
			System.out.println("��ע=="+tempRec.getRemark());
			System.out.println("����=="+tempRec.getService());
			System.out.println("ʱ��=="+tempRec.getTime());
			System.out.println("����=="+tempRec.getMoney());
		}*/
		return recordList;
	}
	
	//������м�¼����Ŀ����
	public int getTotalById(){
		return c.countRecord();
	}
}
