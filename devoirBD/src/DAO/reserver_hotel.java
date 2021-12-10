
package DAO;

import java.sql.Date;

public class reserver_hotel {
private String visiteur;
private String hotel;
//private int date_res;
//private int date_fin;
private Date date_res;
private Date date_fin;
 

public reserver_hotel() {
	super();
	// TODO Auto-generated constructor stub
}
public reserver_hotel( String visiteur, String hotel ,Date date_res,Date date_fin) {
	super();
	this.date_res =date_res ;
	this.visiteur = visiteur;
	this.hotel = hotel;
	this.date_fin = date_fin;
}

public String getVisiteur() {
	return visiteur;
}
public void setVisiteur(String visiteur) {
	this.visiteur = visiteur;
}
public String getHotel() {
	return hotel;
}
public void setHotel(String hotel) {
	this.hotel = hotel;
}
public Date getDate_res() {
	return date_res;
}
public void setDate_res(Date date_res) {
	this.date_res = date_res;
}
public Date getDate_fin() {
	return date_fin;
}
public void setDate_fin(Date date_fin) {
	this.date_fin = date_fin;
}


}

