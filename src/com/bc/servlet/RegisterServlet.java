package com.bc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bc.bean.User;
import com.bc.db.UserDB;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String userid = request.getParameter("userid");
		String username = request.getParameter("username");
		String userpassword = request.getParameter("userpassword");
		int usertype = Integer.parseInt(request.getParameter("usertype"));
		
		User user = new User(userid,username,userpassword,usertype);
		UserDB.addUser(user);
		
		response.sendRedirect("/Hotel/login.jsp");
		
		
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
