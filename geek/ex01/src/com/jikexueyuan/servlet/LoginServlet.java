package com.jikexueyuan.servlet;

import java.io.IOException;

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

        if (userName != "" && userName.equals("ftf") && password != "" && password.equals("123456")) {
            resp.sendRedirect(req.getContextPath() + "/17/success.jsp");
        } else {
            resp.sendRedirect(req.getContextPath() + "/17/error.jsp");
        }

        System.out.println("用户名 ==> " + userName);
        System.out.println("密码 ==> " + password);
    }

}
