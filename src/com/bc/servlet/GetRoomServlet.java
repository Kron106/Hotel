package com.bc.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bc.bean.Room;
import com.bc.db.RoomDB;


@WebServlet("/GetRoomServlet")
public class GetRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public GetRoomServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String oldroomid = request.getParameter("roomid");
		//System.out.println(oldroomid);
		ArrayList<Room> rooms = RoomDB.getRooms();
		Room newroom = new Room();
		for (Room room : rooms) {
			if(room.getRoomid().equals(oldroomid))
			{
				newroom = room;
			}
		}
		request.setAttribute("newroom", newroom);
		request.setAttribute("oldroomid", oldroomid);
		request.getRequestDispatcher("/update.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
