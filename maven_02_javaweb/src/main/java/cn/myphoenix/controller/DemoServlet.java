package cn.myphoenix.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {

    /**
     * 客户端 :  <a href="/demo">访问服器</a>
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("服务器被访问到了..............");
        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }
}
