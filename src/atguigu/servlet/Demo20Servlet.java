package atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        name="Demo20Servlet",
        urlPatterns={"/demo20","/demo2020"},
        loadOnStartup=1,
        initParams = {
                @WebInitParam(
                        name="username",
                        value="zhangsan"
                ),
                @WebInitParam(
                        name="username",
                        value="lisi"
                )
        }
)
public class Demo20Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo20202020020");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
