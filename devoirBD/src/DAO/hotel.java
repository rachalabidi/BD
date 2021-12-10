package DAO;

import java.sql.Date;

public class hotel {
	private String nom;
	private String adress;
	private int codepostal;
	private String ville;
	
	public hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hotel(String nom, String adress, int codepostal, String ville, int etoiles, int nbr_tot_ch,
			int nbr_ch_dispo) {
		super();
		this.nom = nom;
		this.adress = adress;
		this.codepostal = codepostal;
		this.ville = ville;
		this.etoiles = etoiles;
		this.nbr_tot_ch = nbr_tot_ch;
		this.nbr_ch_dispo = nbr_ch_dispo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getEtoiles() {
		return etoiles;
	}
	public void setEtoiles(int etoiles) {
		this.etoiles = etoiles;
	}
	public int getNbr_tot_ch() {
		return nbr_tot_ch;
	}
	public void setNbr_tot_ch(int nbr_tot_ch) {
		this.nbr_tot_ch = nbr_tot_ch;
	}
	public int getNbr_ch_dispo() {
		return nbr_ch_dispo;
	}
	public void setNbr_ch_dispo(int nbr_ch_dispo) {
		this.nbr_ch_dispo = nbr_ch_dispo;
	}
	private int etoiles;
	private int nbr_tot_ch;
	private int nbr_ch_dispo;
}
