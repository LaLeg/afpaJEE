package fr.leghtas.client.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.leghtas.client.controller.AjoutClientServlet;
import fr.leghtas.client.dao.IClientDao;
import fr.leghtas.client.domain.Client;

public class ClientDaoImpl implements IClientDao {
	private static Logger LOGGER = LoggerFactory.getLogger(ClientDaoImpl.class);
	@Override
	public List<Client> findAll() {
		List<Client> listeClients = new  ArrayList<>();
		LOGGER.info("je suis bien dans la classe DaoImpl");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","afpa1208");
			PreparedStatement ps = cnx.prepareStatement("SELECT * FROM client");
			ResultSet resultat = ps.executeQuery();
			while (resultat.next()) {
				Integer id = resultat.getInt("ID");
				Integer numeroClient = resultat.getInt("numero_client");
				String nom =resultat.getString("Nom");
				String prenom = resultat.getString("Prenom");
				String adresse = resultat.getString("Adress");
				String telFixe = resultat.getString("Tel_Fixe");
				String telPortable = resultat.getString("Tel_Portable");
				String dateNaissance = resultat.getString("date_naissance");
				String email = resultat.getString("Email");

				Client c = new Client(id, numeroClient, nom, prenom, adresse, telFixe, telPortable, dateNaissance, email);
				listeClients.add(c);	
			}
		} catch (Exception e) {
			LOGGER.info("Exception : ", e);
			
		}
		return listeClients;
	}

	@Override
	public Client getClientById(Integer id) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","afpa1208");
			PreparedStatement ps = cnx.prepareStatement("SELECT ID, numero_client, Nom, Prenom, Adress, Tel_Fixe, Tel_Portable, date_naissance, Email FROM client WHERE ID = ? ");
			ps.setInt(1, id);
			ResultSet resultat = ps.executeQuery();
			while (resultat.next()) {
				Integer ide = resultat.getInt("ID");
				Integer numeroClient = resultat.getInt("numero_client");
				String nom =resultat.getString("Nom");
				String prenom = resultat.getString("Prenom");
				String adresse = resultat.getString("Adress");
				String telFixe = resultat.getString("Tel_Fixe");
				String telPortable = resultat.getString("Tel_Portable");
				String dateNaissance = resultat.getString("date_naissance");
				String email = resultat.getString("Email");
				Client c = new Client(ide, numeroClient, nom, prenom, adresse, telFixe, telPortable, dateNaissance, email);
				return c;
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public void ajoutClient(Integer numeroClient, String nom, String prenom, String adresse, String telFixe,
			String telPortable, String dateNaissance, String email) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","afpa1208");
			PreparedStatement ps = cnx.prepareStatement("INSERT INTO client(numero_client, Nom, Prenom, Adress, Tel_Fixe, Tel_Portable, date_naissance, Email)VALUES(?,?,?,?,?,?,?,?)");
			ps.setInt(1, numeroClient);
			ps.setString(2, nom);
			ps.setString(3, prenom);
			ps.setString(4, adresse);
			ps.setString(5, telFixe);
			ps.setString(6, telPortable);
			ps.setString(7, dateNaissance);
			ps.setString(8, email);
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void modifierClient(Integer id, Integer numeroClient, String nom, String prenom, String adresse,
			String telFixe, String telPortable, String dateNaissance, String email) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","afpa1208");
			PreparedStatement ps = cnx.prepareStatement("UPDATE client SET numero_client =?, Nom =?, Prenom = ?,Adress=?, tel_Fixe=?, tel_Portable=?, date_naissance=?, Email=? WHERE ID = ?");
			ps.setInt(1, numeroClient);
			ps.setString(2, nom);
			ps.setString(3, prenom);
			ps.setString(4, adresse);
			ps.setString(5, telFixe);
			ps.setString(6, telPortable);
			ps.setString(7, dateNaissance);
			ps.setString(8, email);
			ps.setInt(9, id);
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
