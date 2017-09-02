package org.jsyuger.web.service;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.jsyuger.web.dao.BaseDAO;
import org.jsyuger.web.dao.UserDAO;
import org.jsyuger.web.vo.User;

public class UserService {
	private UserDAO user=new UserDAO();
	
	//�����û�
	public boolean add() throws Exception{
	  boolean status=user.addUser();
	  return status;
	  //System.out.println("�����û�״̬=="+status);
	}
	
	//ɾ���û�
	public void delete(){
		User tempuUser=user.loadUserById(3);
		boolean status=user.deleteUser(tempuUser);
		System.out.println("ɾ���û�=="+status);
	}
	
	//�޸��û�
	public void modify(){
		boolean status=false;
		User tempuUser=user.loadUserById(2);
		if(tempuUser!=null){
			tempuUser.setUsername("���㴴��4��");
			tempuUser.setPassword("1212");
			status= BaseDAO.update(tempuUser);
		}
		System.out.println("�޸��û�=="+status);
	}
	
	//ͨ��ID���û�(����¼)
	public void searchById(){
		User tempuUser=user.loadUserById(3);
		if(tempuUser!=null){
			System.out.println("�û�����=="+tempuUser.getUsername());
			System.out.println("����ʱ�䣺=="+tempuUser.getPassword());
		}
	}
	
	//ͨ���������û�������¼��
	public User searchOne(String username,String password,String type){
		User tempUser=user.loadUser(username,password,type);
		if(tempUser!=null){
			System.out.println("�û�����=="+tempUser.getUsername());
			System.out.println("����ʱ�䣺=="+tempUser.getPassword());
	    }
		return tempUser;
	}
	
	//ͨ���������û��б��б�
	public void searchList(){
		List<User> userList=user.list();
		for (User tempUser : userList) {
			System.out.println("�û�����=="+tempUser.getUsername());
			System.out.println("����ʱ�䣺=="+tempUser.getPassword());
		}
	}
	
//ͨ����ҳ+�������û��б��б�
//	List<Usertest> userList=listByPage();
//	for (Usertest tempUser : userList) {
//		System.out.println("�û�����=="+tempUser.getUserName());
//		System.out.println("����ʱ�䣺=="+tempUser.getCdate());
//	}
	
//ͨ������ͳ������
//	int count=countUser();
//	System.out.println("��¼��Ϊ��"+count);

}



