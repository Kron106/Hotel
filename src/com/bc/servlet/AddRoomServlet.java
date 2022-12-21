package com.bc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bc.bean.Room;
import com.bc.db.RoomDB;


@WebServlet("/AddRoomServlet")
public class AddRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddRoomServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roomid = request.getParameter("roomid");
		String roomname = request.getParameter("roomname");
		String city = request.getParameter("city");
		String type = request.getParameter("type");

		int level = Integer.parseInt(request.getParameter("level"));
		String status = request.getParameter("status");
		String address = request.getParameter("address");
		String connection = request.getParameter("connection");
		
		Room room = new Room(roomid,roomname,city,type,level,status,address,connection);
		System.out.println(room.toString());
		RoomDB.addRoom(room);
		request.getRequestDispatcher("/RoomsServlet").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
