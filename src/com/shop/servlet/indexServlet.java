package com.shop.servlet;

import com.shop.pojo.Goods;
import com.shop.service.GoodsService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/index")
public class indexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        GoodsService service = new GoodsService();
        List<Goods> phoneList = null;
        List<Goods> computerList = null;
        List<Goods> peripheralList = null;
        List<Goods> partsList = null;
        try {
            phoneList = service.getGoodsListByGoods_id(1);
            computerList = service.getGoodsListByGoods_id(2);
            peripheralList = service.getGoodsListByGoods_id(3);
            partsList = service.getGoodsListByGoods_id(4);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("phonelist",phoneList);
        request.setAttribute("computerlist",computerList);
        request.setAttribute("peripherallist",peripheralList);
        request.setAttribute("partslist",partsList);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
