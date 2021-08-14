package atguigu.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//servletContext对象练习
@WebServlet("/demo18")
public class Demo18Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        Integer num = (Integer) servletContext.getAttribute("num");

        if (null==num){
            num=1;
        }else{
            num++;
        }
        servletContext.setAttribute("num",num);
        num=(Integer)servletContext.getAttribute("num");

        System.out.println("访问次数 = " + num);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
