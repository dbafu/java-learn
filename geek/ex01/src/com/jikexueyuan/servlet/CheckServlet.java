package com.jikexueyuan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jikexueyuan.entity.User;
import com.jikexueyuan.service.CheckUserService;

public class CheckServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CheckUserService cku = new CheckUserService();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");

        RequestDispatcher rd = null;
        String forward = null;

        if (uname == null && upwd == null) {
            request.setAttribute("msg", "用户名或者密码为空！");
            rd = request.getRequestDispatcher("/17/error.jsp");
            rd.forward(request, response);
        } else {
            User user = new User();
            user.setName(uname);
            user.setPassword(upwd);

            boolean bool = cku.check(user);
            if (bool) {
                forward = "/17/success.jsp";
            } else {
                request.setAttribute("msg", "用户名或者密码输入错误，请重新输入!");
                forward = "/17/error.jsp";
            }
            rd = request.getRequestDispatcher(forward);
            rd.forward(request, response);
        }
    }

}
