package com.shop.servlet;

import com.shop.pojo.User;
import com.shop.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        String user_id = request.getParameter("user_id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String birth = request.getParameter("birth");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        User user = new User();
        user.setUser_id(user_id);
        user.setUsername(username);
        user.setPassword(password);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = sdf.parse(birth);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        user.setBirth(date);
        user.setAddress(address);
        user.setPhone(phone);
        user.setEmail(email);
        UserService service = new UserService();
        try {
            service.Register(user);
            request.setAttribute("user",user);
            System.out.println(user);
            request.getRequestDispatcher("register.jsp").forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
