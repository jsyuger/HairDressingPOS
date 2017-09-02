package org.jsyuger.web.service;

import java.util.List;

import org.jsyuger.web.dao.MemberRecordDAO;
import org.jsyuger.web.vo.Memberrecord;

public class MemberRecordService {
	MemberRecordDAO mr= new MemberRecordDAO();
	public List getRecordByPage(){
		//通过分页+条件查用户列表（列表）
		List<Memberrecord> recordList=mr.listByPage();
		for (Memberrecord tempRec : recordList) {
			System.out.println("创建时间：=="+tempRec.getId());
			System.out.println("用户名：=="+tempRec.getCardNum());
			System.out.println("创建时间：=="+tempRec.getName());
			System.out.println("创建时间：=="+tempRec.getRemark());
			System.out.println("创建时间：=="+tempRec.getService());
			System.out.println("创建时间：=="+tempRec.getCost());
			System.out.println("创建时间：=="+tempRec.getTime());
			System.out.println("创建时间：=="+tempRec.getBarber());
		}
		return recordList;
	}
}
