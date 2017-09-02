package org.jsyuger.web.dao;

import java.util.List;

import org.jsyuger.web.vo.Serviceitem;

public class ServiceItemDAO {
	public boolean addServiceItem(Serviceitem si) throws Exception {
		boolean flag = false;
		Serviceitem serviceitem = new Serviceitem();
		serviceitem.setName(si.getName());
		serviceitem.setType(si.getType());
		serviceitem.setColor(si.getColor());
		serviceitem.setTimeConsuming(si.getTimeConsuming());
		serviceitem.setPrice(si.getPrice());
		serviceitem.setService(si.getService());
		serviceitem.setRemark(si.getRemark());

		flag = BaseDAO.add(serviceitem);
		System.out.println(flag);
		System.out.println("服务产品添加信息："+si.getName()+si.getType()+si.getColor()+
				si.getTimeConsuming()+si.getPrice()+si.getRemark());
		return flag;
	}

	public boolean deleteServiceItem(Serviceitem recommend) {
		boolean flag = false;
		flag = BaseDAO.delete(recommend);
		return flag;
	}

	public Serviceitem loadUserById(int id) {
		Serviceitem recommend = (Serviceitem)BaseDAO.get(Serviceitem.class, id);
		return recommend;
	}

	public Serviceitem loadUser(String username,String password,String type) {
		String hql = "from User where userName=? and password=? and type=?"; 
		String[] param = {username,password,type};
		Serviceitem User = (Serviceitem)BaseDAO.queryOne(hql, param);
		return User;
	}
	
	//show all
	public List<Serviceitem> list() {
		String hql = "from Serviceitem where id>?";
		String[] param = {"0"};
		List<Serviceitem> list = BaseDAO.query(hql, param);
		return list;
	}
	
	//show one kind
	public List<Serviceitem> listOneKind(String s) {
		String hql = "from Serviceitem where service=?";
		String[] param = {s};
		List<Serviceitem> list = BaseDAO.query(hql, param);
		return list;
	}
	
	//show one kind by attribute
	public List<Serviceitem> listOneKindByColor(String service,String color) {
		String hql = "from Serviceitem where service=? and color=?";
		String[] param = {service,color};
		List<Serviceitem> list = BaseDAO.query(hql, param);
		return list;
	}
	//show one kind by attribute
	public List<Serviceitem> listOneKindByType(String service,String type) {
		String hql = "from Serviceitem where service=? and type=?";
		String[] param = {service,type};
		List<Serviceitem> list = BaseDAO.query(hql, param);
		return list;
	}
	//show one kind by attribute
	public List<Serviceitem> listOneKindByTimeConsuming(String service,String timeConsuming) {
		String hql = "from Serviceitem where service=? and timeConsuming=?";
		String[] param = {service,timeConsuming};
		List<Serviceitem> list = BaseDAO.query(hql, param);
		return list;
	}
	//show one kind by attribute
	public List<Serviceitem> listOneKindByPrice(String service,String price) {
		String hql = "from Serviceitem where service=? and price=?";
		String[] param = {service,price};
		List<Serviceitem> list = BaseDAO.query(hql, param);
		return list;
	}

	public static List<Serviceitem> listByPage() {
		String hql = "from User where userName=? and cdate>?";
		String[] param = {"wzy","2016-11-20 00:00:01"};
		List<Serviceitem> list = BaseDAO.queryByPage(hql, param, 2, 2);
		return list;
	}
	
	public boolean updateServiceItem(Serviceitem serviceitem) {
		boolean flag = false;
		flag = BaseDAO.update(serviceitem);
		System.out.print(flag);
		return flag;
	}
}
