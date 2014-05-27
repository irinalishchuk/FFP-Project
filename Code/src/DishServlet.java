import MealPackage.dish.Dish;
import MealPackage.dish.DishDao;
import MealPackage.product.Product;
import MealPackage.product.ProductDao;
import com.sun.scenario.effect.impl.prism.PrDrawable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DishServlet extends HttpServlet {
    private static String INSERT_OR_EDIT_PRODUCT = "/editproduct.jsp"; // user
    private static String LIST_PRODUCT = "/loggedIn.jsp"; // listuser
    private DishDao dao;

    public DishServlet() {
        super();
        dao = new DishDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            String product_name = request.getParameter("dish_name"); // userID
            dao.deleteDish(product_name);
            forward = LIST_PRODUCT;
            request.setAttribute("dishes", dao.getAllDishes());
        }
        else if (action.equalsIgnoreCase("listDishes")){
            forward = LIST_PRODUCT;
            request.setAttribute("dishes", dao.getAllDishes());
        }
        else {
            forward = INSERT_OR_EDIT_PRODUCT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Product> products = new ArrayList<>();

        List<String> productNames = Arrays.asList((request.getParameter("products_to_dish").split(",")));

        for (int i = 0; i < productNames.size(); i++) {
            Product product = ProductDao.getProductByName(productNames.get(i));
            products.add(product);
        }

        Dish dish = new Dish(request.getParameter("new_dish_name"), products);
        dao.addDish(dish);

        RequestDispatcher view = request.getRequestDispatcher(LIST_PRODUCT);
        request.setAttribute("dishes", dao.getAllDishes());
        view.forward(request, response);
    }
}
