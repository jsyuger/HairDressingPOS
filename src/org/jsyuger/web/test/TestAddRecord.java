package org.jsyuger.web.test;

import org.jsyuger.web.service.ServiceRecommendService;
import org.jsyuger.web.service.UserService;
import org.jsyuger.web.vo.Servicerecommend;
import org.jsyuger.web.vo.User;

public class TestAddRecord {
	
	User u = new User();
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Servicerecommend sr=new Servicerecommend(1,"1","1","1","1",1,1,"1","1");
//		ServiceRecommendService s=new ServiceRecommendService();
//		s.addRecommendService(sr);
		
		UserService us=new UserService();
		System.out.print(us.add());
	}

}
