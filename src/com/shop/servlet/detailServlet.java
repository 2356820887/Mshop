package com.shop.servlet;

import com.shop.pojo.Goods;
import com.shop.pojo.Type;
import com.shop.service.GoodsService;
import com.shop.service.TypeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/detail")
public class detailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");
        TypeService typeService = new TypeService();
        GoodsService goodsService = new GoodsService();
        try {
            Goods goodsList =goodsService.getGoodsById(id);
            request.setAttribute("goods",goodsList);
            request.getRequestDispatcher("details.jsp").forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
