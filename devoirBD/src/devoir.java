

import java.sql.Date;
import java.util.ArrayList;

import DAO.ManipulationBD;
import DAO.annulation;
import DAO.reserver_hotel;

public class devoir {

	public static void main(String[] args) {
		ManipulationBD M = new ManipulationBD();
		ArrayList<String> L = new ArrayList<String>();
		//Consulter les h�tels ayant des chambres disponibles � une date donn�e
		L = M.consulter(0);
		for(String s : L){
			System.out.println("L'hotel est:" + s);
		}
		//Consulter les activit�s propos�es dans les sites proches d�un l�h�tel donn� (sp�cifi� en param�tre)	
/*		L = M.consulter();
		for(String s : L){
			System.out.println("L'hotel est:" + s);
		} */
		
////Faire une r�servation dans un h�tel		
		 // reserver_hotel r= new reserver_hotel("rasha","cirta", Date.valueOf("2021-12-12"),Date.valueOf("2021-12-14"));
		//boolean b = M.inserer(r);
		//System.out.println(b);
		
		
//Annuler une r�servation
    	/*	annulation a= new annulation("rasha","cirta",Date.valueOf("2021-12-12"));
		boolean b = M.delete(a);
		System.out.println(b); */
	}

}
