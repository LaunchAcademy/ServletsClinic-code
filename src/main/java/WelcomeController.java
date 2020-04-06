import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/welcome")
public class WelcomeController extends HttpServlet {


  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    PrintWriter writer = resp.getWriter();
    writer.println("<h1>Our first web app with Java</h1>");
    writer.println("<p>You accessed " + req.getServletPath() + "</p>");
    writer.println("<p>You accessed " + req.getServerName() + "</p>");
    writer.println("<p>You accessed " + req.getServerPort() + "</p>");
  }
}
