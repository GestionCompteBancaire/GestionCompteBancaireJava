package Mod�le;

public class Personne {
	
	private String cin;
	private String nom;
	private String prenom;
	
	
	public Personne() {
		super();
	}

	public Personne(String cin, String nom, String prenom) {
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
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

	@Override
	public String toString() {
		return cin + ", " + nom + ", " + prenom ;
	}
	
	
	

}
