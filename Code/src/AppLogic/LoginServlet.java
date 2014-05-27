package AppLogic;

import AppLogic.user.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            User user = new User(request.getParameter("username"), request.getParameter("pass"));

            System.out.println(request.getParameter("username"));
            System.out.println(request.getParameter("pass"));

            //user = UserDAO.login(user);
            user.setFirstName("Ira");
            user.setLastName("Lishchuk");

            if (user.getUsername().equals("Ira") && user.getPassword().equals("Ira")) {
                user.setValid(true);
            }
            else if (user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
                user.setValid(true);
                user.setAdmin(true);
            }


            if (user.isValid()) {
                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser", user);
                if (user.isAdmin()) {
                    response.sendRedirect("admin.jsp");
                }
                else {
                    response.sendRedirect("loggedIn.jsp");
                }
            }
            else {
                response.sendRedirect("invalidLogin.jsp");
            }
        }
        catch (Throwable e) {
            System.out.println(e);
        }
    }
}
