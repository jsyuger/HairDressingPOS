package org.jsyuger.web.dao;

import java.util.List;

import org.jsyuger.web.vo.Order;

public class OrderDAO {
	public boolean addOrder(Order o) throws Exception {
		boolean flag = false;
		Order order = new Order();
//		order.setName(o.getName());
//		order.setType(o.getType());
//		order.setColor(o.getColor());
//		order.setTimeConsuming(o.getTimeConsuming());
//		order.setPrice(o.getPrice());
//		order.setService(o.getService());
//		order.setRemark(o.getRemark());
//
//		flag = BaseDAO.add(order);
//		System.out.println(flag);
//		System.out.println("服务产品添加信息："+o.getName()+o.getType()+o.getColor()+
//				o.getTimeConsuming()+o.getPrice()+o.getRemark());
		return flag;
	}

	public boolean deleteOrder(Order order) {
		boolean flag = false;
		flag = BaseDAO.delete(order);
		return flag;
	}

	
	//show all
	public List<Order> list() {
		String hql = "from Serviceitem where id>?";
		String[] param = {"0"};
		List<Order> list = BaseDAO.query(hql, param);
		return list;
	}
	
	//show one kind
	public List<Order> listOrder(String s) {
		String hql = "from Serviceitem where service=?";
		String[] param = {s};
		List<Order> list = BaseDAO.query(hql, param);
		return list;
	}

	public static List<Order> listByPage() {
		String hql = "from User where userName=? and cdate>?";
		String[] param = {"wzy","2016-11-20 00:00:01"};
		List<Order> list = BaseDAO.queryByPage(hql, param, 2, 2);
		return list;
	}
	
	public boolean updateOrder(Order order) {
		boolean flag = false;
		flag = BaseDAO.update(order);
		System.out.print(flag);
		return flag;
	}
}

