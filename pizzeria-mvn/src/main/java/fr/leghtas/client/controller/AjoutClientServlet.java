package fr.leghtas.client.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.leghtas.client.buisiness.IClientBuisiness;
import fr.leghtas.client.buisiness.impl.ClientBuisinessImpl;

/**
 * Servlet implementation class AjoutClientServlet
 */
@WebServlet("/ajout_client")
public class AjoutClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClientBuisiness clientBuisiness = new ClientBuisinessImpl();
	private static Logger LOGGER = LoggerFactory.getLogger(AjoutClientServlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/client/ajout_client.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 Integer numeroClient = Integer.valueOf(request.getParameter("numero_client"));
		 String nom = request.getParameter("nom");
		 String prenom = request.getParameter("prenom");
		 String adresse = request.getParameter("adresse");
		 String telFixe = request.getParameter("tel_fixe");
		 String telPortable = request.getParameter("tel_portable");
		 String dateNaissance = request.getParameter("date_naissance");
		 String email = request.getParameter("email");
		 
		 clientBuisiness.ajoutClient(numeroClient, nom, prenom, adresse, telFixe, telPortable, dateNaissance, email);
		 response.sendRedirect("clients");
	}

}
