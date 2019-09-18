import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class MainServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws IOException {
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();

                writer.println("main servlet");

            writer.append("<!DOCTYPE html>\r\n")
                    .append("<html>\r\n")
                    .append("		<head>\r\n")
                    .append("			<title>Form input</title>\r\n")
                    .append("		</head>\r\n")
                    .append("		<body>\r\n")
                    .append("			<form action=\"user\" method=\"POST\">\r\n")
                    .append("				Enter your name: \r\n")
                    .append("				<input type=\"text\" name=\"user\" />\r\n")
                    .append("				<input type=\"submit\" value=\"Submit\" /><br>\r\n")
                    .append("				Enter your pass: \r\n")
                    .append("				<input type=\"text\" name=\"pass\" />\r\n")
                    .append("				<input type=\"submit\" value=\"Submit\" />\r\n")
                    .append("			</form>\r\n")
                    .append("		</body>\r\n")
                    .append("</html>\r\n");
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



