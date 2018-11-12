package fr.leghtas.jstl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CollectionServlet
 */
@WebServlet("/CollectionServlet")
public class CollectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollectionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String>produit = new ArrayList<>();
		
		produit.add("Eau");
		produit.add("Chocolat");
		produit.add("Boissons");
		produit.add("Fruits & Légumes");
		produit.add("Viandes");
		produit.add("Pains");
		produit.add("Poissons");
		
		produit.add(0, "Lait");
		
		produit.remove(0);
		
		produit.remove("Pains");
		
		produit.set(0, "Pains");
		
		
		request.setAttribute("liste", produit);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Collection.jsp").forward(request, response);

	
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
