package org.jsyuger.web.service;

import java.util.List;

import org.jsyuger.web.dao.MemberRecordDAO;
import org.jsyuger.web.vo.Memberrecord;

public class MemberRecordService {
	MemberRecordDAO mr= new MemberRecordDAO();
	public List getRecordByPage(){
		//ͨ����ҳ+�������û��б��б�
		List<Memberrecord> recordList=mr.listByPage();
		for (Memberrecord tempRec : recordList) {
			System.out.println("����ʱ�䣺=="+tempRec.getId());
			System.out.println("�û�����=="+tempRec.getCardNum());
			System.out.println("����ʱ�䣺=="+tempRec.getName());
			System.out.println("����ʱ�䣺=="+tempRec.getRemark());
			System.out.println("����ʱ�䣺=="+tempRec.getService());
			System.out.println("����ʱ�䣺=="+tempRec.getCost());
			System.out.println("����ʱ�䣺=="+tempRec.getTime());
			System.out.println("����ʱ�䣺=="+tempRec.getBarber());
		}
		return recordList;
	}
}
