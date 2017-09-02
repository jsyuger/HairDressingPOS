package org.jsyuger.web.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.jsyuger.web.service.ServiceRecommendService;
import org.jsyuger.web.service.UserService;


import org.jsyuger.web.vo.Serviceitem;
import org.jsyuger.web.vo.Servicerecommend;
import org.jsyuger.web.vo.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private User user;
	private String username;
	private String password;
	private String type;
	private String info="账号或者密码有误！";
	
	private List orderList=new ArrayList<Serviceitem>();
	
	//登录
	public String login() throws Exception{
		//验证用户
		//System.out.println(user.getUsername()+user.getPassword()+user.getType());
		UserService userService=new UserService();
		User u=userService.searchOne(getUsername(),getPassword(),getType());
		if(u!=null){
			//将用户存入session中
			Map session=ActionContext.getContext().getSession();
			//session.put("user", user.getUsername());
			session.put("user", u);
			
			//放置店铺精品
			ServiceRecommendService srs=new ServiceRecommendService();
			List recommend=srs.showRecommendService();
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("recommend", recommend);
			
			Iterator it=recommend.iterator();
			while(it.hasNext()){
				Servicerecommend s=(Servicerecommend)it.next();
				System.out.print(s.getName());
			}
			
			return "success";
			
		}else{
			//用户验证失败，返回error
			return "error";
		}
	}
	
	//退出登录
	public String logout(){
		Map session=ActionContext.getContext().getSession();
		session.remove("user");
		return "success";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}


}
