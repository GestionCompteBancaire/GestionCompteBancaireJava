package Modèle;

import java.util.ArrayList;

public class Banque {
	
	public ArrayList listes = new ArrayList<Compte>();
	
	
	public void ajouterClient(Compte c) {
			listes.add(c);
	}

}
