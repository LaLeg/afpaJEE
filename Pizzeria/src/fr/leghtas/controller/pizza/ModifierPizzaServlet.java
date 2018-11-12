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
 * Servlet implementation class ModifierPizzaServlet
 */
@WebServlet("/modifier_pizza")
public class ModifierPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       private PizzaBuisiness pizzaBuisiness = new PizzaBuisiness();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		Pizza pizza = pizzaBuisiness.getPizzaById(id);
		request.setAttribute("pizza", pizza);
		this.getServletContext().getRequestDispatcher("/WEB-INF/pizza/modifier_pizza.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String libelle = request.getParameter("libelle");
		String reference = request.getParameter("reference");
		Integer prix = Integer.valueOf(request.getParameter("prix"));
		String url = request.getParameter("url");
		Integer id = Integer.valueOf(request.getParameter("id"));
		pizzaBuisiness.modifierPizza(libelle, reference, prix, url, id);
		response.sendRedirect("pizzas");

	}

}
