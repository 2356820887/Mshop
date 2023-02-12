package com.shop.servlet;

import com.shop.pojo.Cart;
import com.shop.pojo.User;
import com.shop.service.CartService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/addCart")
public class AddCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        User user = (User) request.getSession().getAttribute("user");
        String id = request.getParameter("id");
        CartService cartService=new CartService();
        try {
            cartService.addGoodsToCart(id,user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //验证数据库中是否存在相同的goods，如果有只增加数量
//        try {
//            List<Cart> list=cartService.getCartByUserId(id);
//            for (Cart cart : list){
//                if (cart.getUser_id().equals(user.getUser_id())){
//                    int num=cart.getQuantity();
//                    cartService.updateNum(num+1,id,user);
//                }
//                if (!cart.getUser_id().equals(user.getUser_id())) {
//                    cartService.addGoodsToCart(id,user);
//                }
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        request.getRequestDispatcher("car.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
