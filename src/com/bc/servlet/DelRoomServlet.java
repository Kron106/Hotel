package com.bc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bc.db.RoomDB;

@WebServlet("/DelRoomServlet")
public class DelRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DelRoomServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("roomid");
		RoomDB.delBook(id);
		request.getRequestDispatcher("/RoomsServlet").forward(request, response);
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
