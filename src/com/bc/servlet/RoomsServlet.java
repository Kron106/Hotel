package com.bc.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bc.bean.Room;
import com.bc.bean.User;
import com.bc.controller.AdminUser;
import com.bc.controller.CommenUser;
import com.bc.controller.Context;
import com.bc.db.RoomDB;
import com.bc.db.UserDB;


@WebServlet("/RoomsServlet")
public class RoomsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public RoomsServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String userid = (String)request.getSession().getAttribute("userid");
		
		Context context = null;
		
		System.out.println(userid);
		ArrayList<Room> rooms = RoomDB.getRooms();
//		for (Room room : rooms) {
//			System.out.println(room.toString());
//		}
		
		ArrayList<User> users = UserDB.getUser();
		User u = new User();
		for (User user : users) {
			if (user.getId().equals(userid)) {
				u = user;
			}
		}
		request.setAttribute("rooms", rooms);
		request.setAttribute("users", users);
		request.setAttribute("user", u);
		request.setAttribute("ordroom", u.getOrdroom());
		for(User un : users)
		{
			if(un.getId().equals(userid))
			{
					if(un.getUsertype()==1)	//1是普通用户
					{
						context = new Context(new CommenUser());  
					}
						if(un.getUsertype()==2)//2是管理员
					{
						context = new Context(new AdminUser());  
					}
			}
		}
		context.executeStrategy(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	
}
