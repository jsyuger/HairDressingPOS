package org.jsyuger.web.dao;

public class PaymentDAO {
	
	//通过产品名查找并且统计
	public static int countPaymentByName(String itemname) {
		String hql = "select count(id) from Payment where itemname=?";
		String[] param = {itemname};
		int count = BaseDAO.getCount(hql, param);
		return count;
	}
}
