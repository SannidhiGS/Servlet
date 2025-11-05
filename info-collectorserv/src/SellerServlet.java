import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/seller",loadOnStartup = 1)
public class SellerServlet extends GenericServlet {
    public SellerServlet(){
        System.out.println("The Seller Servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("The Seller servlet running");
        String name = servletRequest.getParameter("name");
        String age = servletRequest.getParameter("age");
        String email = servletRequest.getParameter("email");
        String phone = servletRequest.getParameter("phone");
        String address = servletRequest.getParameter("address");
        String propertyType = servletRequest.getParameter("propertyType");
        String area = servletRequest.getParameter("area");
        String price = servletRequest.getParameter("price");
        String ownership = servletRequest.getParameter("ownership");
        String comments = servletRequest.getParameter("comments");
        System.out.println("The Real Estate Seller Details are:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Property Address: " + address);
        System.out.println("Property Type: " + propertyType);
        System.out.println("Area (sqft): " + area);
        System.out.println("Expected Price: " + price);
        System.out.println("Ownership Type: " + ownership);
        System.out.println("Comments: " + comments);
        System.out.println("----------------------------------------------------------");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("The Seller servlet initiated");
        super.init(config);
    }
}
