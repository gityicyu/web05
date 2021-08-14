package atguigu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
@WebServlet("/demo16")
public class Demo16Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        Object globalname = servletContext.getInitParameter("globalname");
        System.out.println("globalname = " + globalname);


        Enumeration<String> initParameterNames = servletContext.getInitParameterNames();
        while  (initParameterNames.hasMoreElements()){
            String s = initParameterNames.nextElement();
            String initParameter = servletContext.getInitParameter(s);
            System.out.println("s : " + s + " , initParameter :" + initParameter);
        }
    }
}
