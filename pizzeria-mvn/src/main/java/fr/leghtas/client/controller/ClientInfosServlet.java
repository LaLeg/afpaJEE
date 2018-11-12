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
import fr.leghtas.client.domain.Client;

/**
 * Servlet implementation class ClientInfosServlet
 */
@WebServlet("/client_infos")
public class ClientInfosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClientBuisiness clientBuisiness = new ClientBuisinessImpl();
	private static Logger LOGGER = LoggerFactory.getLogger(ClientInfosServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientInfosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		Client client = clientBuisiness.getClientById(id);
		request.setAttribute("clientInfos", client);
		this.getServletContext().getRequestDispatcher("/WEB-INF/client/client_infos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
