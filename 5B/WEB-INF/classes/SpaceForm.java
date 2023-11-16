import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SpaceForm extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>COffee Form</title></head>");
        out.println("<body class='flex-col'><h1>Coffee Form</h1>");
        out.println("<h2>Meal: " + request.getParameter("planet") + "</h2>");
        out.println("</body></html>");
    }
}