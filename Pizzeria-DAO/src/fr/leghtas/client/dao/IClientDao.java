package fr.leghtas.client.dao;

import java.util.List;

import fr.leghtas.client.domain.Client;

public interface IClientDao {
	public List<Client> findAll();
	public Client getClientById(Integer id); 
	public void ajoutClient(Integer numeroClient, String nom, String prenom, String adresse, String telFixe,
			String telPortable, String dateNaissance, String email);
	public void modifierClient(Integer id, Integer numeroClient, String nom, String prenom, String adresse, String telFixe,
			String telPortable, String dateNaissance, String email);

}
