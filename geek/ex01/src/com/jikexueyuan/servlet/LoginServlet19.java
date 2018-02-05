package com.jikexueyuan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet19
 */

public class LoginServlet19 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet19() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=========进入 doPost 方法=========");
		String userName = req.getParameter("uname");
		String password = req.getParameter("upwd");

		String forward = null;

		if (userName != "" && userName.equals("极客学院") && password != "" && password.equals("123456")) {
			// 请求转发
			forward = "/19/success.jsp";
			// forward = "http://www.jikexueyuan.com";
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			rd.forward(req, resp);
			// 请求重定向
			// resp.sendRedirect(req.getContextPath() + "/19/success.jsp");
			// resp.sendRedirect(forward);
		} else {
			// 请求转发
			forward = req.getContextPath() + "/19/error.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			rd.forward(req, resp);

			// 请求重定向
			// resp.sendRedirect(req.getContextPath() + "/19/error.jsp");
		}

		System.out.println("用户名 ==> " + userName);
		System.out.println("密码 ==> " + password);
	}

}
