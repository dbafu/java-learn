package com.jikexueyuan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 6520550639750164887L;

    // @Override
    // protected void service(HttpServletRequest req, HttpServletResponse resp)
    // throws ServletException, IOException {
    // String userName = req.getParameter("uname");
    // String password = req.getParameter("upwd");
    //
    // System.out.println("用户名 ==> " + userName);
    // System.out.println("密码 ==> " + password);
    // }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("=========进入 doGet 方法=========");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("=========进入 doPost 方法=========");
        String userName = req.getParameter("uname");
        String password = req.getParameter("upwd");

        String forward = null;

        if (userName != "" && userName.equals("ftf") && password != "" && password.equals("123456")) {
            // 请求转发
            // forward = "/17/success.jsp";
            forward = "http://www.jikexueyuan.com";
            RequestDispatcher rd = req.getRequestDispatcher(forward);
            // rd.forward(req, resp);
            // 请求重定向
            // resp.sendRedirect(req.getContextPath() + "/17/success.jsp");
            resp.sendRedirect(forward);
        } else {
            // 请求转发
            forward = "/17/error.jsp";
            RequestDispatcher rd = req.getRequestDispatcher(forward);
            rd.forward(req, resp);

            // 请求重定向
            // resp.sendRedirect(req.getContextPath() + "/17/error.jsp");
        }

        System.out.println("用户名 ==> " + userName);
        System.out.println("密码 ==> " + password);
    }

}
