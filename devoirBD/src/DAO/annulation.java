package DAO;
import java.sql.Date;
public class annulation {
	private String hotel;
	private String visiteur;
	private Date date_debut;
	
	public annulation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public annulation(String hotel, String visiteur, Date date_debut) {
		super();
		this.hotel = hotel;
		this.visiteur = visiteur;
		this.date_debut = date_debut;
	}

	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getVisiteur() {
		return visiteur;
	}
	public void setVisiteur(String visiteur) {
		this.visiteur = visiteur;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	
}
