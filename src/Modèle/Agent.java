package Modèle;

public class Agent extends Personne{
	
	private String nomUtilisateur;
	private String motPasse;
	
	
	public Agent() {
		super();
		this.nomUtilisateur = "test";
		this.motPasse = "test123";
	}

	public Agent(String cin, String nom, String prenom, String nomUtilisateur, String motPasse) {
		super(cin, nom, prenom);
		this.nomUtilisateur = nomUtilisateur;
		this.motPasse = motPasse;
	}

	public Agent(String nomUtilisateur, String motPasse) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.motPasse = motPasse;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}
	
	

}
