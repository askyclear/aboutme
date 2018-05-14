package com.hudini.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel=\"stylesheet\" href=\"./css/common.css\">");
		out.println("<link rel=\"stylesheet\" href=\"./css/curtime.css\">");
		out.println("<title>현재 시간 페이지</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div id=container>");
		out.println("<a href=\"./index.html\">메인화면</a>");
		
		//현재 컴퓨터의 시간을 구함
		LocalDateTime curDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/m/d hh:mm");
		String formattedCurTime = curDateTime.format(formatter);
		
		out.println("<h1 id='current_time'>현재시간 : "+ formattedCurTime +"</h1>");
		out.println("</div>");
		out.println("</body>");
		out.close();
		
	}

}
