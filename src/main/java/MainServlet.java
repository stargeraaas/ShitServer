import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class MainServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();
            User user = new User();
            user.setLogin(request.getParameter("login"));
            user.setPassword(request.getParameter("password"));
            try {
                writer.println("login: "+user.getLogin()+", pass:"+ user.getPassword());
            } finally {
                writer.close();
            }
        }
    /*
            @Override
            protected void doPost(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException {
                response.setContentType("text/html");
                PrintWriter writer = response.getWriter();
                User user = new User();
                user.setLogin(request.getParameter("login"));
                user.setPassword(request.getParameter("password"));
                try {
                    writer.println("login: "+user.getLogin()+", pass:"+ user.getPassword());
                } finally {
                    writer.close();
                }
                super.doPost(request, response);
            }*/


    }
