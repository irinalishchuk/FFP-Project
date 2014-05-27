import user.User;
import user.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            System.out.println(request.getParameter("username"));
            System.out.println(request.getParameter("pass"));

            User user = UserDAO.getUserByName(request.getParameter("username"));

            if (!user.getUsername().equals(null) && !user.getPassword().equals(null)) {
                user.setValid(true);
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
