package org.jsyuger.web.dao;

public class PaymentDAO {
	
	//ͨ����Ʒ�����Ҳ���ͳ��
	public static int countPaymentByName(String itemname) {
		String hql = "select count(id) from Payment where itemname=?";
		String[] param = {itemname};
		int count = BaseDAO.getCount(hql, param);
		return count;
	}
}
