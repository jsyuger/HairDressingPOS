package org.jsyuger.web.dao;

import java.util.List;

import org.jsyuger.web.vo.Customer;
import org.jsyuger.web.vo.Memberrecord;

public class CustomerDAO {
	//get all
		public List<Customer> listByPage(int page,int size) {
			String hql = "from Customer c where c.id>?";
			String[] param = {"0"};
			List<Customer> list = BaseDAO.queryByPage(hql, param, page, size);
			return list;
		}
		
		//获取记录条目总数
		public int countRecord() {
			String hql = "select count(id) from Customer where id>?";
			String[] param = {"0"};
			int count = BaseDAO.getCount(hql, param);
			return count;
		}
}
