package fr.leghtas.controller.produit;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.leghtas.bean.Produit;
import fr.leghtas.business.produit.ProduitBuisiness;

/**
 * Servlet implementation class ProduitsServlet
 */
@WebServlet("/produits")
public class ProduitsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProduitBuisiness produitB = new ProduitBuisiness();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProduitsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Produit> nomProduit = produitB.getProduits();

		request.setAttribute("produits", nomProduit );

		this.getServletContext().getRequestDispatcher("/WEB-INF/produit/produits.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
