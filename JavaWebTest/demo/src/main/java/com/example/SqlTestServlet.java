package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SqlTest")
public class SqlTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "jdbc:mysql://110.40.171.227:3306/test";
        String user = "root";
        String password = "root";

        try {
            // 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 建立连接
            Connection conn = DriverManager.getConnection(url, user, password);

            // 创建Statement对象
            Statement stmt = conn.createStatement();

            // 执行查询
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            PrintWriter out = response.getWriter();
            
            out.println("<!DOCTYPE html><html><head><title>Login</title></head><body>");
            out.println("name:");
            // 处理结果
            while (rs.next()) {
                out.println("name:"+rs.getString("id"));
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString("name"));
            }
            out.println("</body></html>");
            // 关闭连接
            rs.close();
            stmt.close();
            conn.close();
            response.setHeader(user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
