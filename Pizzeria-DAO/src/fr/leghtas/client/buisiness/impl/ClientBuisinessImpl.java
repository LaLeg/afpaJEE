package fr.leghtas.client.buisiness.impl;

import java.util.List;

import fr.leghtas.client.buisiness.IClientBuisiness;
import fr.leghtas.client.dao.IClientDao;
import fr.leghtas.client.dao.impl.ClientDaoImpl;
import fr.leghtas.client.domain.Client;

public class ClientBuisinessImpl implements IClientBuisiness {
	private IClientDao clientDao = new ClientDaoImpl();

	@Override
	public List<Client> findAll() {
		List<Client> clients = clientDao.findAll();

		return clients;
	}

	@Override
	public Client getClientById(Integer id) {
		Client client = clientDao.getClientById(id);

		return client;
	}

	@Override
	public void ajoutClient(Integer numeroClient, String nom, String prenom, String adresse, String telFixe,
			String telPortable, String dateNaissance, String email) {

		clientDao.ajoutClient(numeroClient, nom, prenom, adresse, telFixe, telPortable, dateNaissance, email);
	}

	@Override
	public void modifierClient(Integer id, Integer numeroClient, String nom, String prenom, String adresse,
			String telFixe, String telPortable, String dateNaissance, String email) {
		clientDao.modifierClient(id, numeroClient, nom, prenom, adresse, telFixe, telPortable, dateNaissance, email);
		
	}
}
