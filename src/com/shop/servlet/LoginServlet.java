package com.shop.servlet;

import com.shop.pojo.User;
import com.shop.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        String user_id = request.getParameter("user_id");
        String password = request.getParameter("password");
        User user = new User();
        user.setUser_id(user_id);
        user.setPassword(password);
        UserService service = new UserService();
        try {
            User login = service.Login(user);
            request.setAttribute("user",login);
            if (login != null){
                request.getSession().setAttribute("user",login);
                request.getRequestDispatcher("index").forward(request,response);
            }else {
                request.setAttribute("stu",1);
                request.getRequestDispatcher("register.jsp").forward(request,response);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
