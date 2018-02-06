package com.jikexueyuan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet20 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet20() {
        super();
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
        String returnUri = request.getParameter("return_uri");

        System.out.println("用户名 ==》 " + uname);
        System.out.println("密码 ==》 " + upwd);
        System.out.println("return_uri ==》 " + returnUri);

        RequestDispatcher rd = null;

        if (uname == null || upwd == null) {
            request.setAttribute("msg", "用户名或者密码为空 ~！");
            rd = request.getRequestDispatcher("/20/login.jsp");
            rd.forward(request, response);
        } else {
            if (uname.equals("极客学院") && upwd.equals("123456")) {
                request.getSession().setAttribute("flag", "login_success");
                if (returnUri != null) {
                    rd = request.getRequestDispatcher(returnUri);
                    rd.forward(request, response);
                } else {
                    rd = request.getRequestDispatcher("/20/index.jsp");
                    rd.forward(request, response);
                }
                rd = request.getRequestDispatcher("/20/hello.jsp");
                rd.forward(request, response);
            } else {
                request.getSession().setAttribute("flag", "login_error");
                request.setAttribute("msg", "用户名或者密码输入错误 ~！");
                rd = request.getRequestDispatcher("/20/login.jsp");
                rd.forward(request, response);
            }
        }
    }

}
