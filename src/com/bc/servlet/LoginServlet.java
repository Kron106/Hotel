package com.bc.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bc.bean.User;
import com.bc.db.LoginCounter;
import com.bc.db.UserDB;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public LoginServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		HttpSession session = request.getSession();
		session.setAttribute("userid", userid);
		String userpassword = request.getParameter("userpassword");
		ArrayList<User> users = UserDB.getUser();		
		
		
		for(User u : users)
		{
			if(u.getId().equals(userid))
			{
				if(u.getUserpassword().equals(userpassword))
				{
					System.out.println(u.getUsername());
					LoginCounter.getSingleton().add(u);
					response.sendRedirect("/Hotel/RoomsServlet");
				}
				
			}
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
