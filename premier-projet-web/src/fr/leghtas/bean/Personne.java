package fr.leghtas.bean;

public class Personne {
	
	private String nom ;
	private String prenom;
	private String dateNaissance;
	private String numeroEtRue;
	private String ville;
	private String departement;
	private String pays;
	private String numeroTelephone;
	private String email;
	private String vosCommentaires;
	private String url;
	
	public Personne() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Personne(String nom, String prenom, String dateNaissance, String numeroEtRue, String ville,
			String departement, String pays, String numeroTelephone, String email, String vosCommentaires, String url) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numeroEtRue = numeroEtRue;
		this.ville = ville;
		this.departement = departement;
		this.pays = pays;
		this.numeroTelephone = numeroTelephone;
		this.email = email;
		this.vosCommentaires = vosCommentaires;
		this.url =url;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getNumeroEtRue() {
		return numeroEtRue;
	}
	public void setNumeroEtRue(String numeroEtRue) {
		this.numeroEtRue = numeroEtRue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getNumeroTelephone() {
		return numeroTelephone;
	}
	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVosCommentaires() {
		return vosCommentaires;
	}
	public void setVosCommentaires(String vosCommentaires) {
		this.vosCommentaires = vosCommentaires;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
