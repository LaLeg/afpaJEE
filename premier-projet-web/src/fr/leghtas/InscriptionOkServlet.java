package fr.leghtas;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InscriptionOkServlet
 */
@WebServlet("/InscriptionOkServlet")
public class InscriptionOkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionOkServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom =request.getParameter("nom");
		request.setAttribute("nom", nom);
		
		String prenom=request.getParameter("prenom");
		request.setAttribute("prenom", prenom);
		
		String dateNaissance = request.getParameter("date-naissance");
		request.setAttribute("dateNaissance", dateNaissance);
		
		String NumeroEtRue = request.getParameter("adresse");
		request.setAttribute("NumeroEtRue", NumeroEtRue);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/InscriptionOk.jsp").forward(request, response);

	}

}
