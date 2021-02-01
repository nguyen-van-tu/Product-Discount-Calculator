import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet ", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description  = request.getParameter("Description");
        double price = Double.parseDouble(request.getParameter("Price"));
        double discountPercent = Double.parseDouble(request.getParameter("Discount"));
        double result = price * discountPercent * 0.01;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h3> Description is:" + description + "</h3>" + "<h3>Discount Amount is: " + result);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}