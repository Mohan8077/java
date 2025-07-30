package demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><style>");
        out.println("body { background:#e0f7fa; text-align:center; padding-top:100px; font-family:sans-serif; }");
        out.println("h1 { color:#00796b; }");
        out.println("</style></head><body>");
        out.println("<h1>Hell Java 👋</h1>");
        out.println("<h2>Ohh YESss...!!</h2>");
        out.println("</body></html>");
    }
}
