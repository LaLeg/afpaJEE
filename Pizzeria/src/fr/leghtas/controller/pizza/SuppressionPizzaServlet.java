package fr.leghtas.controller.pizza;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.leghtas.bean.Pizza;
import fr.leghtas.buisiness.pizza.PizzaBuisiness;

/**
 * Servlet implementation class SuppressionPizzaServlet
 */
@WebServlet("/suppression_pizza")
public class SuppressionPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PizzaBuisiness pizzaBuisiness = new PizzaBuisiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuppressionPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		pizzaBuisiness.supprimerPizza(id);

		response.sendRedirect("pizzas");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.sendRedirect("pizzas");
		
	}

}
