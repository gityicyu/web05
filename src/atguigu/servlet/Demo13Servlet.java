package atguigu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/demo13")
public class Demo13Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        这样拿不到
        int num =1;
//        创建ServletContext对象
//        ServletContext servletContext = getServletConfig().getServletContext();
        ServletContext servletContext = getServletContext();
//        存储在ServletContext对象中
//        先存后区
        servletContext.setAttribute("num",num);
}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
