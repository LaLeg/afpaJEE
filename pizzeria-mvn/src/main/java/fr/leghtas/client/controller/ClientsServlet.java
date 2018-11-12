package fr.leghtas.client.controller;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ClientsServlet
 */
@WebServlet("/clients")
public class ClientsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClientBuisiness clientBuisiness = new ClientBuisinessImpl();
	private static Logger LOGGER = LoggerFactory.getLogger(ClientsServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Client> client = clientBuisiness.findAll();
		request.setAttribute("listeClients", client);
		LOGGER.info("Je suis bien dans la servlet ClientsServlet");
		this.getServletContext().getRequestDispatcher("/WEB-INF/client/clients.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
