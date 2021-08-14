package atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/demo21")
public class Demo21Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Demo21Servlet");
//        获取请求方式
        String method = req.getMethod();
        System.out.println("请求方式 = " + method);
//        获取项目的访问名称
        String contextPath = req.getContextPath();
        System.out.println("项目访问名称 = " + contextPath);

//        不可取的方法，灵活性不够
        String imgPath="/web05/homework.txt";
        System.out.println(imgPath);
//        可取的方法，
        String imgPath2 = req.getContextPath()+File.separator+"homework.txt";
        System.out.println(imgPath2);

//        获取Servlet的访问名称
        String servletPath = req.getServletPath();
        System.out.println("servletPath = " + servletPath);

//        获取客户端的IP
        String remoteAddr = req.getRemoteAddr();
        System.out.println("remoteAddr = " + remoteAddr);

//获取服务器的IP
        String localAddr = req.getLocalAddr();
        System.out.println("服务器的ip地址是"+localAddr);

//        获取URI，在当前项目中找资源
        String requestURI = req.getRequestURI();
        System.out.println("URI = " + requestURI);

//        获取URL，在当前互联网中找资源
        StringBuffer requestURL = req.getRequestURL();
        System.out.println("URL = " + requestURL);

//        获取QueryString
        String queryString = req.getQueryString();
        System.out.println(queryString);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
