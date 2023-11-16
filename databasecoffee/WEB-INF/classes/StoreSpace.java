import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class StoreSpace extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
            String cust_order = request.getParameter("cust_order");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/orders","root","10022004");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into orders values('" + name + "','" + cust_order + "')");
            stmt.close();
            con.close();
            PrintWriter out = response.getWriter();
            out.println("<html><head>");
            out.println("<link rel='stylesheet' href='style.css' /> <title>Store Space</title></head>");
            out.println("<body class='flex-col'><h1>Order Database</h1>");
            out.println("<h2>Order added successfully</h2>");
            out.println("<a href='accessspace'>Click here to see the database</a>");
            out.println("</body></html>");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}