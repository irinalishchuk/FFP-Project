import MealPackage.product.Product;
import MealPackage.product.ProductDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ProductServlet extends HttpServlet {
    //private static String INSERT_OR_EDIT_PRODUCT = "/editproduct.jsp"; // user
    private static String LIST_PRODUCT = "/loggedIn.jsp"; // listuser
    private ProductDao dao;

    public ProductServlet() {
        super();
        dao = new ProductDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            String product_name = request.getParameter("product_name"); // userID
            dao.deleteProduct(product_name);
            forward = LIST_PRODUCT;
            request.setAttribute("products", dao.getAllProducts());
        }
        else if (action.equalsIgnoreCase("listProducts")){
            forward = LIST_PRODUCT;
            request.setAttribute("products", dao.getAllProducts());
        }
         else {
            forward = INSERT_OR_EDIT_PRODUCT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward); // forward to "forward" page
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Product product = new Product();

        product.setName(request.getParameter("product_name"));
        product.setAmount(Integer.valueOf(request.getParameter("product_amount")));
        product.setDimension(request.getParameter("product_dimension"));
        product.setPrice(Float.valueOf(request.getParameter("product_price")));

        dao.addProduct(product);

        RequestDispatcher view = request.getRequestDispatcher(LIST_PRODUCT);
        request.setAttribute("products", dao.getAllProducts());
        view.forward(request, response);
    }
}
