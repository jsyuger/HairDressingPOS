package org.jsyuger.web.dao;

import java.util.List;

import org.jsyuger.web.vo.Memberrecord;


public class MemberRecordDAO {
	//get all
	public List<Memberrecord> listByPage() {
		String hql = "from Memberrecord m where m.id>?";
		String[] param = {"0"};
		List<Memberrecord> list = BaseDAO.queryByPage(hql, param, 1, 2);
		return list;
	}
	
	//get by money
	
}
