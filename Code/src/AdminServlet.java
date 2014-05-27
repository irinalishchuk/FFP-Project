import MealPackage.product.Product;
import user.UserDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdminServlet extends HttpServlet {
    private static String LIST_USERS = "/admin.jsp"; // listuser
    private UserDAO dao;

    public AdminServlet() {
        super();
        dao = new UserDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            String product_name = request.getParameter("username"); // userID
            dao.deleteUser(product_name);
            forward = LIST_USERS;
            request.setAttribute("users", dao.getAllUsers());
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

}
