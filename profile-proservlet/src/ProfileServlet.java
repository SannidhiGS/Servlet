import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/profile")
public class ProfileServlet extends GenericServlet {
    public ProfileServlet(){
        System.out.println("Profile Sevlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("The profile servlet is running");
        System.out.println("Personal Information");
        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String mob=servletRequest.getParameter("mobileNumber");
        String age=servletRequest.getParameter("age");
        String gender=servletRequest.getParameter("gender");
        String dob = servletRequest.getParameter("dob");
        String status = servletRequest.getParameter("status");
        System.out.println("Name:"+name+" "+"email:"+email+" "+"mobileNumber:"+mob+" "+"Age:"+age+" "+"Gender:"+gender+" "+"dob:"+dob+" "+ "status:"+status);

        System.out.println("Education Details");
        String sName=servletRequest.getParameter("sclName");
        String stuName=servletRequest.getParameter("sclStudentName");
        String yop=servletRequest.getParameter("sclYOP");
        String perc=servletRequest.getParameter("sclPercentage");
        System.out.println("The school details are: ");
        System.out.println("Name:"+sName+" "+"Student name:"+stuName+" "+"Year of Passing:"+yop +" "+"Percentage:"+" "+perc);

        String pName=servletRequest.getParameter("puCollege");
        String stName=servletRequest.getParameter("puStudentName");
        String yeop=servletRequest.getParameter("puYOP");
        String percent=servletRequest.getParameter("puPercentage");
        System.out.println("The pu college details:");
        System.out.println("Name:"+pName+" "+"Student Name:"+stName+" "+"YearOfPassing:"+yeop+" "+"Percentage:"+percent);

        String gradCollege=servletRequest.getParameter("gradCollege");
        String gradStudentName=servletRequest.getParameter("gradStudentName");
        String gradYOP=servletRequest.getParameter("gradYOP");
        String gradPercentage=servletRequest.getParameter("gradPercentage");
        String gradStream=servletRequest.getParameter("gradStream");
        System.out.println("Graduation college details");
        System.out.println("Graduation:"+gradCollege+" "+"Student Name:"+gradStudentName+" "+"Graduation Year:"+gradYOP+" " +"Graduation Percentage"+gradPercentage+"Graduation Stream:"+gradStream);

        String cname = servletRequest.getParameter("cname");
        String cemail = servletRequest.getParameter("cemail");
        String primarySkill = servletRequest.getParameter("primarySkill");
        String secondarySkill = servletRequest.getParameter("secondarySkill");
        String db = servletRequest.getParameter("db");
        String ide = servletRequest.getParameter("ide");
        String uiTech = servletRequest.getParameter("uiTech");
        String exp = servletRequest.getParameter("exp");
        String frameworks = servletRequest.getParameter("frameworks");
        String otherSkills = servletRequest.getParameter("otherSkills");
        System.out.println("Skill set Details");

        System.out.println(" Name: " + name + ", Email: " + email + ", Primary Skill: " + primarySkill + ", Secondary Skill: " + secondarySkill + ", Database: " + db + ", IDEs: " + ide + ", UI Technologies: " + uiTech + ", Experience (years): " + exp + ", Frameworks: " + frameworks + ", Other Skills: " + otherSkills);

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Profile Servlet Initialized");
    }
}
