package com.bc.db;

import java.util.HashMap;
import java.util.Map;

import com.bc.bean.User;

public class LoginCounter {
	private Map<String,Integer> map = new HashMap<String,Integer>();
	private volatile static LoginCounter loginCounter;  
	private LoginCounter (){}  
	public static LoginCounter getSingleton() {  
		if (loginCounter == null) {  
			synchronized (LoginCounter.class) {  
		        if (loginCounter == null) {  
		        	loginCounter = new LoginCounter();  
		        }  
		        }  
		    }  
		return loginCounter;  
	}
	    
	public void add(User u) {
		String userId = u.getId();
		//存在
		if (map.containsKey(userId)) {
			Integer number = map.get(userId) + 1;
			map.put(userId,number);
		}else {
			map.put(userId,1);
		}
		System.out.println(userId+"登录次数为："+map.get(userId));
	}
	
	public Integer getAll() {
		Integer sum=0;
		  for (Integer value : map.values()) {
			  sum += value;
		    }
		return sum;
	}
}
