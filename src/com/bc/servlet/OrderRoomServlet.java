package com.bc.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bc.bean.User;
import com.bc.db.UserDB;

@WebServlet("/OrderRoomServlet")
public class OrderRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public OrderRoomServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String orderroomname = request.getParameter("orderroomname");
		String userid = (String)request.getSession().getAttribute("userid");
		//查找orderid是否存在，不存在则添加
		//System.out.println(orderroomname);
		ArrayList<User> users = UserDB.getUser();
		ArrayList<String> orderrooms = new ArrayList<String>();
		for (User user : users) {
			if (user.getId().equals(userid)) {
				orderrooms = user.getOrdroom();
			}
		}
		int count=0;
		for (String string : orderrooms) {
			if (string.equals(orderroomname)) {
				break;
			}
			else {
				count++;
			}
		}
		if(count==orderrooms.size())
		{
			orderrooms.add(orderroomname);
			for (User user : users) {
				if (user.getId().equals(userid)) {
					user.setOrdroom(orderrooms);
				}
			}
		}
		request.getRequestDispatcher("/RoomsServlet").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
