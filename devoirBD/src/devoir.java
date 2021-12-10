

import java.sql.Date;
import java.util.ArrayList;

import DAO.ManipulationBD;
import DAO.annulation;
import DAO.reserver_hotel;

public class devoir {

	public static void main(String[] args) {
		ManipulationBD M = new ManipulationBD();
		ArrayList<String> L = new ArrayList<String>();
		//Consulter les hôtels ayant des chambres disponibles à une date donnée
		L = M.consulter(0);
		for(String s : L){
			System.out.println("L'hotel est:" + s);
		}
		//Consulter les activités proposées dans les sites proches d’un l’hôtel donné (spécifié en paramètre)	
/*		L = M.consulter();
		for(String s : L){
			System.out.println("L'hotel est:" + s);
		} */
		
////Faire une réservation dans un hôtel		
		 // reserver_hotel r= new reserver_hotel("rasha","cirta", Date.valueOf("2021-12-12"),Date.valueOf("2021-12-14"));
		//boolean b = M.inserer(r);
		//System.out.println(b);
		
		
//Annuler une réservation
    	/*	annulation a= new annulation("rasha","cirta",Date.valueOf("2021-12-12"));
		boolean b = M.delete(a);
		System.out.println(b); */
	}

}
