package org.jsyuger.web.service;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.jsyuger.web.dao.BaseDAO;
import org.jsyuger.web.dao.UserDAO;
import org.jsyuger.web.vo.User;

public class UserService {
	private UserDAO user=new UserDAO();
	
	//新增用户
	public boolean add() throws Exception{
	  boolean status=user.addUser();
	  return status;
	  //System.out.println("新增用户状态=="+status);
	}
	
	//删除用户
	public void delete(){
		User tempuUser=user.loadUserById(3);
		boolean status=user.deleteUser(tempuUser);
		System.out.println("删除用户=="+status);
	}
	
	//修改用户
	public void modify(){
		boolean status=false;
		User tempuUser=user.loadUserById(2);
		if(tempuUser!=null){
			tempuUser.setUsername("西点创客4号");
			tempuUser.setPassword("1212");
			status= BaseDAO.update(tempuUser);
		}
		System.out.println("修改用户=="+status);
	}
	
	//通过ID查用户(单记录)
	public void searchById(){
		User tempuUser=user.loadUserById(3);
		if(tempuUser!=null){
			System.out.println("用户名：=="+tempuUser.getUsername());
			System.out.println("创建时间：=="+tempuUser.getPassword());
		}
	}
	
	//通过条件查用户（单记录）
	public User searchOne(String username,String password,String type){
		User tempUser=user.loadUser(username,password,type);
		if(tempUser!=null){
			System.out.println("用户名：=="+tempUser.getUsername());
			System.out.println("创建时间：=="+tempUser.getPassword());
	    }
		return tempUser;
	}
	
	//通过条件查用户列表（列表）
	public void searchList(){
		List<User> userList=user.list();
		for (User tempUser : userList) {
			System.out.println("用户名：=="+tempUser.getUsername());
			System.out.println("创建时间：=="+tempUser.getPassword());
		}
	}
	
//通过分页+条件查用户列表（列表）
//	List<Usertest> userList=listByPage();
//	for (Usertest tempUser : userList) {
//		System.out.println("用户名：=="+tempUser.getUserName());
//		System.out.println("创建时间：=="+tempUser.getCdate());
//	}
	
//通过条件统计数量
//	int count=countUser();
//	System.out.println("记录数为："+count);

}



