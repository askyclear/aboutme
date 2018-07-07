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
/*
 * 현 서블릿으로 request가 올때 현재 시간을 client로  출력하는 servlet 클래스
 * 수정날짜 : 2018.07.07
 * 작성자 : 김대선
 */
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
		//내용 출력
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>몇시예요</title>");
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
