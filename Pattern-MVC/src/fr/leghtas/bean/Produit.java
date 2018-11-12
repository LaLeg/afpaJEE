package fr.leghtas.bean;

public class Produit {
	
	private String nom;
	private Double prix;
	private String url;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Produit(String nom, Double prix, String url) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.url = url;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
