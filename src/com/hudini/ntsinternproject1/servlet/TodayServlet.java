package com.hudini.ntsinternproject1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 시스템상에서 현재 시간을 구한뒤 클라이언트로 현재시간 노출하기.
 * 작성날짜 : 2018.07.07
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
		DateFormat dateFormat = new SimpleDateFormat("yyyy/m/d hh:mm");
		String formattedCurrentTime = dateFormat.format(currentTime);
		System.out.println(formattedCurrentTime);
		
		out.close();
	}

}
