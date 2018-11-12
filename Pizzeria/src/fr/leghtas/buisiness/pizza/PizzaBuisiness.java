package fr.leghtas.buisiness.pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.leghtas.bean.Pizza;

public class PizzaBuisiness {

	public ArrayList<Pizza> getPizzas(){

		ArrayList<Pizza> liste = new ArrayList<>();

		try {
			//Driver
			Class.forName("com.mysql.jdbc.Driver");

			//Connection
			Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","afpa1208");

			//Execution de la requette sql
			Statement statement = cnx.createStatement();
			ResultSet resultat = statement.executeQuery("SELECT id, libelle, reference, prix, url_image FROM pizza");

			while (resultat.next()) {
				Integer id = resultat.getInt("id");
				String libelle = resultat.getString("libelle");
				String reference = resultat.getString("reference");
				Integer prix = resultat.getInt("prix");
				String url_image = resultat.getString("url_image");

				Pizza p = new Pizza(id, libelle, reference, prix, url_image);
				liste.add(p);

			}


		} catch (Exception e) {
			e.printStackTrace();
		}
		return liste;
	}
public void ajoutPizza(String libelle, String reference, Integer prix, String url) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","afpa1208");
		PreparedStatement ps = cnx.prepareStatement("INSERT INTO pizza(libelle, reference, prix, url_image)VALUES(?,?,?,?)");
		ps.setString(1, libelle);
		ps.setString(2, reference);
		ps.setInt(3, prix);
		ps.setString(4, url);
		
		ps.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
}
public Pizza getPizzaById(Integer id) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","afpa1208");
		PreparedStatement ps = cnx.prepareStatement("SELECT id, libelle, reference, prix, url_image FROM pizza WHERE id=?");
		ps.setInt(1, id);
		ResultSet resultat = ps.executeQuery();
		while (resultat.next()) {
			Integer idBD = resultat.getInt("id");
			String libelle = resultat.getString("libelle");
			String reference = resultat.getString("reference");
			Integer prix = resultat.getInt("prix");
			String url_image = resultat.getString("url_image");

			Pizza p = new Pizza(idBD, libelle, reference, prix, url_image);
			return p;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	
	
	return null;
}
public void modifierPizza(String libelle, String reference, Integer prix, String url, Integer id) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","afpa1208");
		PreparedStatement ps = cnx.prepareStatement("UPDATE pizza SET libelle = ?, reference =?, prix=?, url_image=? WHERE id = ?");
		ps.setString(1, libelle);
		ps.setString(2, reference);
		ps.setInt(3, prix);
		ps.setString(4, url);
		ps.setInt(5, id);
		ps.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	
	// TODO Auto-generated method stub
	
	
}
public void supprimerPizza(Integer id) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","afpa1208");
		PreparedStatement ps = cnx.prepareStatement("DELETE FROM pizza WHERE id = ?");
		ps.setInt(1, id);
		ps.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	// TODO Auto-generated method stub
	
}
}
