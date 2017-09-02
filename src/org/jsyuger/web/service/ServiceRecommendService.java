package org.jsyuger.web.service;

import java.util.List;

import org.jsyuger.web.dao.ServiceRecommendDAO;
import org.jsyuger.web.vo.Servicerecommend;

public class ServiceRecommendService {
	ServiceRecommendDAO recommend=new ServiceRecommendDAO();
	
	//search
	public List showRecommendService(){
		List<Servicerecommend> recordList=recommend.list();
		return recordList;
	}
	
	//add
	public boolean addRecommendService(Servicerecommend sr) throws Exception{
		if(sr.getName()!=null&&!(sr.getName().equals("")))
			return recommend.addRecommend(sr);
		else 
			return false;
	}
	
	//update
	public boolean editRecommendService(Servicerecommend sr){
		return recommend.updateServicerecommend(sr);
	}
	
	//delete
	public boolean deleteRecommendService(Servicerecommend sr){
		return recommend.deleteRecommend(sr);
	}
}