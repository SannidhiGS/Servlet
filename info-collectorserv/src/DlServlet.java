import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/license",loadOnStartup = 1)
public  class DlServlet extends GenericServlet {
    public DlServlet(){
        System.out.println("The Dl servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("The Dl Servlet Running");
        String fullname = servletRequest.getParameter("fullname");
        String dob = servletRequest.getParameter("dob");
        String gender = servletRequest.getParameter("gender");
        String address = servletRequest.getParameter("address");
        String phone = servletRequest.getParameter("phone");
        String email = servletRequest.getParameter("email");
        String bloodgroup = servletRequest.getParameter("bloodgroup");
        String vehicletype = servletRequest.getParameter("vehicletype");
        String licensetype = servletRequest.getParameter("licensetype");
        String experience = servletRequest.getParameter("experience");
        String aadhar = servletRequest.getParameter("aadhar");
        String idproof = servletRequest.getParameter("idproof");
        String idnumber = servletRequest.getParameter("idnumber");
        String testdate = servletRequest.getParameter("testdate");
        String comment = servletRequest.getParameter("comment");
        System.out.println("The Driving License Details are:");
        System.out.println("Full Name: " + fullname);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Blood Group: " + bloodgroup);
        System.out.println("Vehicle Type: " + vehicletype);
        System.out.println("License Type: " + licensetype);
        System.out.println("Experience: " + experience);
        System.out.println("Aadhar Number: " + aadhar);
        System.out.println("ID Proof Type: " + idproof);
        System.out.println("ID Number: " + idnumber);
        System.out.println("Test Date: " + testdate);
        System.out.println("Comment: " + comment);
        System.out.println("----------------------------------------------------------");
       servletResponse.setContentType("text/html");
       PrintWriter writer=servletResponse.getWriter();
       writer.println("Data saved successfully.............."+fullname);
     writer.println("The Driving License Details are:");
       writer.println(" Full Name: " + fullname);
        writer.println(" Date of Birth: " + dob);
       writer.println(" Gender: " + gender);
       writer.println(" Address: " + address);
        writer.println(" Phone: " + phone);
        writer.println(" Email: " + email);
        writer.println(" Blood Group: " + bloodgroup);
        writer.println(" Vehicle Type: " + vehicletype);
        writer.println(" License Type: " + licensetype);
        writer.println(" Experience: " + experience);
        writer.println(" Aadhar Number: " + aadhar);
        writer.println(" ID Proof Type: " + idproof);
        writer.println(" ID Number: " + idnumber);
        writer.println(" Test Date: " + testdate);
        writer.println(" Comment: " + comment);

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("The DL Servlet initiated");
        super.init(config);
    }
}
