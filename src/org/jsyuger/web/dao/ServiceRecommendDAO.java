package org.jsyuger.web.dao;

import java.util.List;

import org.jsyuger.web.vo.Servicerecommend;

public class ServiceRecommendDAO {
	public boolean addRecommend(Servicerecommend sr) throws Exception {
		boolean flag = false;
		Servicerecommend recommend = new Servicerecommend();
		recommend.setName(sr.getName());
		recommend.setType(sr.getType());
		recommend.setColor(sr.getColor());
		recommend.setTimeConsuming(sr.getTimeConsuming());
		recommend.setPrePrice(sr.getPrePrice());
		recommend.setPrice(sr.getPrice());
		recommend.setService(sr.getService());
		recommend.setRemark(sr.getRemark());

		flag = BaseDAO.add(recommend);
		System.out.println(flag);
		System.out.println("店铺精品添加信息："+sr.getName()+sr.getType()+sr.getColor()+
				sr.getTimeConsuming()+sr.getPrePrice()+sr.getPrice()+sr.getRemark());
		return flag;
	}

	public boolean deleteRecommend(Servicerecommend recommend) {
		boolean flag = false;
		flag = BaseDAO.delete(recommend);
		return flag;
	}

	public Servicerecommend loadUserById(int id) {
		Servicerecommend recommend = (Servicerecommend)BaseDAO.get(Servicerecommend.class, id);
		return recommend;
	}

	public Servicerecommend loadUser(String username,String password,String type) {
		String hql = "from User where userName=? and password=? and type=?"; 
		String[] param = {username,password,type};
		Servicerecommend User = (Servicerecommend)BaseDAO.queryOne(hql, param);
		return User;
	}
	
	//show all
	public List<Servicerecommend> list() {
		String hql = "from Servicerecommend where id>?";
		String[] param = {"0"};
		List<Servicerecommend> list = BaseDAO.query(hql, param);
		return list;
	}

	public static List<Servicerecommend> listByPage() {
		String hql = "from User where userName=? and cdate>?";
		String[] param = {"wzy","2016-11-20 00:00:01"};
		List<Servicerecommend> list = BaseDAO.queryByPage(hql, param, 2, 2);
		return list;
	}
	
	public boolean updateServicerecommend(Servicerecommend recommend) {
		boolean flag = false;
		flag = BaseDAO.update(recommend);
		System.out.print(flag);
		return flag;
	}
}
