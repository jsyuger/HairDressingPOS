package org.jsyuger.web.service;

import org.jsyuger.web.dao.PaymentDAO;

public class PaymentService {
	
	//通过产品名查找并且统计
	public int countPaymentByName(String itemname){
		return PaymentDAO.countPaymentByName(itemname);
	}

}
