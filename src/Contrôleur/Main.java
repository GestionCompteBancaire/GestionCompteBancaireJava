package Contrôleur;

import java.util.ArrayList;

import Modèle.*;

public class Main {

	public static void main(String[] args) {
		ArrayList listes = new ArrayList<Compte>();
		Client c1 =new Client("BK684411","Meryem","NAMIQ","02/12/1999","0633257359","Bouskoura");
		Client c2 =new Client("BK684dd","Salma","BENCHERIFI","02/12/1999","0633257359","Bouskoura");
		Client c3 =new Client("BK6844dd","Kaoutar","FATIN","02/12/1999","0633257359","Bouskoura");
		Compte cpt1=new Compte(c1, 1000);
		Compte cpt2=new Compte(c2, 1000);
		Compte cpt3=new Compte(c3, 1000);
		listes.add(cpt1);
		listes.add(cpt2);
		listes.add(cpt3);
		for(int i=0;i<listes.size();i++) {
			System.out.println(listes.get(i));
		}
		try {
			((Compte) listes.get(2)).getSoldeFinalCredit(1500);
		} catch (PasDeSold e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------");
		for(int i=0;i<listes.size();i++) {
			System.out.println(listes.get(i));
		}
	}

}
