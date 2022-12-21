package com.bc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Context角色，上下文角色，封装算法对高层屏蔽，高层模块只用访问Context。
public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	 public void executeStrategy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	     strategy.doOperation(request,response);

	   }
}
