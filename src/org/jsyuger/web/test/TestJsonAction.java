package org.jsyuger.web.test;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;


public class TestJsonAction {
	
    private static final long serialVersionUID = -3571998877536556903L;

    public String testJson() throws Exception {
        
    	Person p1 = new Person();
        p1.setName("nn");
        p1.setAge("11");
        Person p2 = new Person();
        p2.setName("gg");
        p2.setAge("12");
        Person p3 = new Person();
        p3.setName("rr");
        p3.setAge("24");
        List<Person> ulist = new ArrayList<Person>();
        ulist.add(p1);
        ulist.add(p2);
        ulist.add(p3);
        String name =ServletActionContext.getRequest().getParameter("name");
        String age = ServletActionContext.getRequest().getParameter("age");
        Person p4 = new Person();
        p4.setName(name);
        p4.setAge(age);
        ulist.add(p4);
        JSONArray json = JSONArray.fromObject(ulist);
        ServletActionContext.getResponse().getWriter().print(json);
        return null;
        //return Action.SUCCESS;
        
    	
    	/*
        String result = "[{\"username\": \"your name\", \"user_json\": {\"username\": \"your name\", \"nickname\": \"your nickname\"}}]";  
        //�����ַ�����  
        //�����ַ�������JSON����  
        //������������ʽ ��ʹ�� JSONArray.fromObject(result) ת��ΪJSONArray ����  
        //�����json����  ����ʹ��JSONObject.fromObject(result) ת��ΪJSONObject ����  
        JSONArray resultArray = JSONArray.fromObject(result);  
        JSONObject jsonObject = resultArray.getJSONObject(0);  
        JSONObject user_json = jsonObject.getJSONObject("user_json");  
        //����keyֵȡֵ  
        String username = user_json.getString("username");  
        String nickname = user_json.getString("nickname");  
        System.out.println("username =" + username  + ":" + "nickname = " + nickname); 
        return null;
        */
    }

}
