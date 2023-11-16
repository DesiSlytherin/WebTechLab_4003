import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SpaceServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Click for details!</title></head>");
        out.println("<body class='flex-col'><h1>Coffee details</h1>");
        out.println("<table><tr><th>Coffee</th><th>Calories</th></tr>");
        out.println("<tr><td>Simple Blend</td><td>124</td></tr>");
        out.println("<tr><td>Fancy Blend</td><td>194</td></tr>");
        // out.println("<tr><td>Venus</td><td>")
        out.println("</table></body></html>");
    }
}