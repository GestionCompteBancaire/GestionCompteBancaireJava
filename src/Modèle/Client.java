package Modèle;

public class Client extends Personne{
	
	private String dateNaissance;
    private String numTelephone;
    private String adresse;
    
    
	public Client() {
		super();
	}

	public Client(String dateNaissance, String numTelephone, String adresse) {
		super();
		this.dateNaissance = dateNaissance;
		this.numTelephone = numTelephone;
		this.adresse = adresse;
	}

	public Client(String cin, String nom, String prenom, String dateNaissance, String numTelephone, String adresse) {
		super(cin, nom, prenom);
		this.dateNaissance = dateNaissance;
		this.numTelephone = numTelephone;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return super.toString()+", " + dateNaissance + ", " + numTelephone + ", " + adresse;
	}

    
}
