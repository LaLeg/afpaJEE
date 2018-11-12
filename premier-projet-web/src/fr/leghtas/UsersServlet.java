package fr.leghtas;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.leghtas.bean.Personne;

/**
 * Servlet implementation class UsersServlet
 */
@WebServlet("/UsersServlet")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Personne julle = new Personne("Dupont", "Julle", "1970-12-12","1 rue LaRue" ,"Roubaix","Nord" ,"France", "0310203040", "j.dupond@gmail.com", "salut tout le monde","ressources/Images/visage_julle.png");
		Personne paul = new Personne("Merisier", "Paul", "1975-10-10","2 rue Racine" , "Tourcoing", "Nord", "France", "0311213141","p.merisier@hotmail.com" , "les produits sont intéressents", "ressources/Images/visage_paul.gif");
		Personne pierre = new Personne("Poirrier","Pierre","1976-09-01","3 rue Lune","Croix","Nord", "France", "0312223242","p.poirrier@yahoo.fr","le produit A est top","ressources/Images/visage_pierre.gif");
		
		ArrayList<Personne>Personnes = new ArrayList<Personne>();
		
		Personnes.add(julle);
		Personnes.add(paul);
		Personnes.add(pierre);
		
		request.setAttribute("personnes", Personnes);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Users.jsp").forward(request, response);
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
