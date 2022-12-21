package com.bc.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bc.bean.User;
import com.bc.db.UserDB;


@WebServlet("/RemoveRoomServlet")
public class RemoveRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RemoveRoomServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String removeroomname = request.getParameter("removeroomname");
		String userid = (String)request.getSession().getAttribute("userid");
		System.out.println(removeroomname);
		ArrayList<User> users = UserDB.getUser();
		ArrayList<String> orderrooms = new ArrayList<String>();
		for (User user : users) {
			if (user.getId().equals(userid)) {
				orderrooms = user.getOrdroom();
			}
		}
		
		Iterator<String> it = orderrooms.iterator();
		while (it.hasNext()) {
			if (it.next().equals(removeroomname)) {
				it.remove();
			}
			
		}
		
		for (User user : users) {
			if (user.getId().equals(userid)) {
				user.setOrdroom(orderrooms);
			}
		}
		
		request.getRequestDispatcher("/RoomsServlet").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
