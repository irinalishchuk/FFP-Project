package AppLogic;

import AppLogic.user.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class MealServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User currentUser = (User)(session.getAttribute("currentSessionUser"));
        String name = request.getParameter("product");
        System.out.println("NAME " + name);
        currentUser.getProducts().get(0).setName(name);
        session.setAttribute("currentSessionUser", currentUser);
        response.sendRedirect("loggedIn.jsp");
    }
}
