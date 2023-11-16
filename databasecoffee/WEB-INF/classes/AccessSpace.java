import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class AccessSpace extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><head>");
            out.println("<link rel='stylesheet' href='style.css' /> <title>Access Orders</title></head>");
            out.println("<body class='flex-col'><h1>Orders Database</h1>");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/orders","root","10022004");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from orders");
            out.println("<table><tr><th>Name</th><th>Order</th></tr>");
            while(rs.next()) {
                out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td></tr>");
            }
            out.println("</table>");
            out.println("</body></html>");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}