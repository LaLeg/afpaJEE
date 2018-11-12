package fr.leghtas.client.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.leghtas.client.buisiness.IClientBuisiness;
import fr.leghtas.client.buisiness.impl.ClientBuisinessImpl;
import fr.leghtas.client.domain.Client;

/**
 * Servlet implementation class ModifierClientServlet
 */
@WebServlet("/modifier_client")
public class ModifierClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClientBuisiness clientBuisiness = new ClientBuisinessImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifierClientServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		Client client = clientBuisiness.getClientById(id);
		request.setAttribute("client", client);
		this.getServletContext().getRequestDispatcher("/WEB-INF/client/modifier_client.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id =Integer.valueOf(request.getParameter("id"));
		Integer numeroClient = Integer.valueOf(request.getParameter("numero_client"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String telFixe = request.getParameter("tel_fixe");
		String telPortable = request.getParameter("tel_portable");
		String dateNaissance = request.getParameter("date_naissance");
		String email = request.getParameter("email");
		clientBuisiness.modifierClient(id, numeroClient, nom, prenom, adresse, telFixe, telPortable, dateNaissance, email);
		response.sendRedirect("clients");
	}

}
