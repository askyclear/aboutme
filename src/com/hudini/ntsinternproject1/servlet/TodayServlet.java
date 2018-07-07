package com.hudini.ntsinternproject1.servlet;

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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		//현재시간 구하기
		LocalDateTime currentTime = LocalDateTime.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/M/d hh:mm"); 
		String formattedCurrentTime = dateFormat.format(currentTime);
		System.out.println(formattedCurrentTime);
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>몇시예요</title>");
		out.println("<link rel='stylesheet' href='./css/common.css'>");
		out.println("<link rel='stylesheet' href='./css/today.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<nav><a href='./index.html'><span>메인으로</span> </a></nav>");
		out.print("<section><h1>");
		out.print("현재시간 : " + formattedCurrentTime);
		out.println("</h1></section>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
