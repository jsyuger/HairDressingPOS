package org.jsyuger.web.dao;

import java.util.Date;
import java.util.List;

import org.jsyuger.web.vo.User;

public class UserDAO {
	public boolean addUser() throws Exception {
		boolean flag = false;
		User tempUser = new User();
		tempUser.setUsername("koko");
		tempUser.setPassword("123");
		tempUser.setType("cash");
		//tempUser.setPassword(new Date());
		flag = BaseDAO.add(tempUser);
		return flag;
	}

	public boolean deleteUser(User user) {
		boolean flag = false;
		flag = BaseDAO.delete(user);
		return flag;
	}

	public User loadUserById(int id) {
		User user = (User)BaseDAO.get(User.class, id);
		return user;
	}

	public User loadUser(String username,String password,String type) {
		String hql = "from User where userName=? and password=? and type=?"; 
		String[] param = {username,password,type};
		User User = (User)BaseDAO.queryOne(hql, param);
		return User;
	}

	public List<User> list() {
		String hql = "from User where userName=? and cdate>?";
		String[] param = {"wzy","2016-11-20 00:00:01"};
		List<User> list = BaseDAO.query(hql, param);
		return list;
	}

	public static List<User> listByPage() {
		String hql = "from User where userName=? and cdate>?";
		String[] param = {"wzy","2016-11-20 00:00:01"};
		List<User> list = BaseDAO.queryByPage(hql, param, 2, 2);
		return list;
	}
	
	public static boolean updateUser(User user) {
		boolean flag = false;
		flag = BaseDAO.update(user);
		return flag;
	}
	
	public static int countUser() {
		String hql = "select count(id) from Usertest where userName=? and cdate>?";
		String[] param = {"wzy","2016-11-20 00:00:01"};
		int count = BaseDAO.getCount(hql, param);
		return count;
	}
	
	//理论上所有底层方法均为static
}
