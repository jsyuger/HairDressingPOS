package org.jsyuger.web.service;

import org.jsyuger.web.dao.PaymentDAO;

public class PaymentService {
	
	//ͨ����Ʒ�����Ҳ���ͳ��
	public int countPaymentByName(String itemname){
		return PaymentDAO.countPaymentByName(itemname);
	}

}
