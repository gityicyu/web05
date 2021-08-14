package atguigu.utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 *  类目录：对JDBC代码，进行共性抽取，形成方法
 *  要被其他程序调用的
 */
public class JDBCUtils {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    //类的加载器获取字节输入流，读取配置文件
    static{
        try {
            InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbcConfig.properties");
//    创建Properties对象
            Properties prop = new Properties();
            prop.load(in);
            in.close();
            driver = prop.getProperty("driver");
            url = prop.getProperty("url");
            username = prop.getProperty("username");
            password = prop.getProperty("password");
            Class.forName(driver);
        }catch  (Exception ex){
            ex.printStackTrace();
        }
    }
public static Connection getConnection() throws SQLException {
   Connection con = DriverManager.getConnection(url,username,password);
   return  con;
}
public static void close(ResultSet rs, Statement stat,Connection con){
        if (rs!=null) {
            try {
                rs.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    if (stat!=null) {
        try {
            stat.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    if (stat!=null) {
        try {
            stat.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}






}
