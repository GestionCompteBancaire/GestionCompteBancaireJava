package Modèle;

import java.util.Date;

public class Compte {
	
	private static int compteur=10000;
    private int nCompte;
    private Client client;
    private float soldeInitial;
    private float soldeTrans;
    private float soldeFinal;
    private Date dateAction;
    
    
    
    public float getSoldeFinal() {
		return soldeFinal;
	}

	public void setSoldeFinal(float soldeFinal) {
		this.soldeFinal = soldeFinal;
	}

	
    
    public Compte() {
    }

    public Compte( Client client, float soldeInitial) {
        this.nCompte = ++compteur;
        this.client = client;
        this.soldeInitial = soldeInitial;
        this.soldeTrans = 0;
        this.dateAction = new Date();
        this.soldeFinal = soldeInitial;
    }
    
    public int getnCompte() {
		return nCompte;
	}

	public void setnCompte(int nCompte) {
		this.nCompte = nCompte;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public float getSoldeInitial() {
		return soldeInitial;
	}

	public void setSoldeInitial(float soldeInitial) {
		this.soldeInitial = soldeInitial;
	}

	public float getSoldeTrans() {
		return soldeTrans;
	}

	

	public void setSoldeTrans(float soldeTrans) {
		this.soldeTrans = soldeTrans;
	}

	public Date getDateAction() {
		return dateAction;
	}

	public void setDateAction(Date dateAction) {
		this.dateAction = dateAction;
	}

	public void getSoldeFinalCredit(float solde) throws PasDeSold {
    	if(solde<=soldeFinal) {
    		soldeFinal=soldeFinal-solde;
    		this.setSoldeTrans(solde);
    	}else
    		throw new PasDeSold("Solde Insuffisant");
		   
    }

	public void getSoldeFinalDebit(float solde)  {
    		soldeFinal=soldeFinal+solde;
    		this.setSoldeTrans(solde);
    }

	@Override
	public String toString() {
		return " [" + nCompte + ",(" + client + "), " + soldeInitial + ", "
				+ soldeTrans + ", " + soldeFinal + ", " + dateAction + "]";
	}
	
	
    
}
