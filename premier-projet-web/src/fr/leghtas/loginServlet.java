package fr.leghtas;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.leghtas.bean.Personne;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = "monLogin";
		request.setAttribute("login", login);
		
		String mdp="monMotDePasse";
		request.setAttribute("MDP", mdp);
		
		Personne jean = new Personne("Dubois", "Jean","1970-12-12", "1 rue saRue", "Roubaix","Nord","France","0310203040","j.dubois@gmail.com","interessé par vos produits","");
		request.setAttribute("jean_infos", jean);
		
		int nombre1 = 10;
		int nombre2 = 90;
		request.setAttribute("nombre1", nombre1);
		request.setAttribute("nombre2", nombre2);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/loging.jsp").forward(request, response);
		
		// TODO Auto-generated method stub
		response.getWriter().append("hello");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
