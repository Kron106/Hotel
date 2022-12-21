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


@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public UpdateServlet() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String oldroomid = request.getParameter("oldroomid");
		String roomid = request.getParameter("roomid");
		String roomname = request.getParameter("roomname");
		String city = request.getParameter("city");
		String type = request.getParameter("type");
		int level = Integer.parseInt(request.getParameter("level"));
		String address = request.getParameter("address");
		String connection = request.getParameter("connection");
		//String status=null;
		//Room nr = new Room(roomid,roomname,city,type,level,status,address,connection);	
		//System.out.println("up"+nr.toString()+oldroomid);
		ArrayList<Room> rooms = RoomDB.getRooms();
		for (Room room : rooms) {
			if(room.getRoomid().equals(oldroomid))
			{
				room.setAddress(address);
				room.setCity(city);
				room.setConnection(connection);
				room.setRoomid(roomid);
				room.setRoomname(roomname);
				room.setType(type);
				room.setLevel(level);
				
				//System.out.println("nr"+room.toString()+oldroomid);
			}
		}
		
		request.getRequestDispatcher("/RoomsServlet").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
