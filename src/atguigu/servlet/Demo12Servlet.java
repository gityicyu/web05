package atguigu.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class Demo12Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获得ServletConfig对象
        ServletConfig servletConfig = getServletConfig();
//        获取Servlet名称
        String servletName = servletConfig.getServletName();
        System.out.println("servletName = " + servletName);//Demo12Servlet
//        获取Servlet初始化参数
        String username = servletConfig.getInitParameter("username");
        System.out.println("username = " + username);

//        枚举类
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
//        遍历枚举类
        while(initParameterNames.hasMoreElements()){
//            获取每个参数的名称
            String paramterName = initParameterNames.nextElement();
            String initParameter = servletConfig.getInitParameter(paramterName);
            System.out.println("name : " + paramterName + " , value :" +initParameter);


        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
