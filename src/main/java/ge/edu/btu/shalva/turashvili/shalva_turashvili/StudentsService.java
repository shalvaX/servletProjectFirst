package ge.edu.btu.shalva.turashvili.shalva_turashvili;

import ge.edu.btu.shalva.turashvili.shalva_turashvili.models.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/student")
public class StudentsService extends HttpServlet {
    public static final String VIEW = "/student.jsp";

    Student student = new Student();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ServletException, IOException {
        req.setAttribute("student",student);

        RequestDispatcher view = req.getRequestDispatcher(VIEW);
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        student.setName(req.getParameter("name"));
        student.setSurname(req.getParameter("surname"));
        student.setCourse(req.getParameter("course"));
        student.setGender(req.getParameter("gender"));
        student.setYear(Integer.parseInt(req.getParameter("year")));

        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getCourse());
        System.out.println(student.getGender());
        System.out.println(student.getYear());

    }
}
