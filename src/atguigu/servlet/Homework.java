package atguigu.servlet;

import atguigu.utils.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

@WebServlet("/homework")
public class Homework extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取QueryString对象
        String queryString = req.getQueryString();
        String[] split = queryString.split("&");
        for (String s : split) {
            System.out.println(s);
        }

//        获得连接对象
        Connection connection;
        Statement stat;
try {
    connection = JDBCUtils.getConnection();
    stat = connection.createStatement();

    String sql = "SELECT username,`password` FROM `use`;";
    PreparedStatement pst = connection.prepareStatement(sql);

}catch (Exception ex){
    ex.printStackTrace();
}


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
