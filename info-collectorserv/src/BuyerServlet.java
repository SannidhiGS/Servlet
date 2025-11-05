import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/buyer",loadOnStartup = 1)
public class BuyerServlet extends GenericServlet {
    public BuyerServlet(){
        System.out.println("Buyer Servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("The Buyer Servlet Running");
        String name = servletRequest.getParameter("name");
        String age = servletRequest.getParameter("age");
        String email = servletRequest.getParameter("email");
        String phone = servletRequest.getParameter("phone");
        String budget = servletRequest.getParameter("budget");
        String location = servletRequest.getParameter("location");
        String propertyType = servletRequest.getParameter("propertyType");
        String loanRequired = servletRequest.getParameter("loanRequired");
        String occupation = servletRequest.getParameter("occupation");
        String comments = servletRequest.getParameter("comments");
        System.out.println("The Real Estate Buyer Details are:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Budget: " + budget);
        System.out.println("Preferred Location: " + location);
        System.out.println("Property Type: " + propertyType);
        System.out.println("Loan Required: " + loanRequired);
        System.out.println("Occupation: " + occupation);
        System.out.println("Comments: " + comments);
        System.out.println("----------------------------------------------------------");

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Buyer Servlet initiated");
        super.init(config);
    }
}
