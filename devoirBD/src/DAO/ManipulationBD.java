package DAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class ManipulationBD {
		private static ConnexionBase con;
		private static Connection Connect;
		public ManipulationBD() {
			con = new ConnexionBase();
			Connect = con.getConnection();
		}
		//Consulter les hôtels ayant des chambres disponibles à une date donnée
		public ArrayList<String> consulter(int x) {
		String query = "select * from hotel where nbr_ch_dispo >  ? ";
		ArrayList<String>  res = new ArrayList<String>();
		PreparedStatement st = null;
		ResultSet r = null;
		try {
			st = this.Connect.prepareStatement(query);
			st.setInt(1, x);
			r = st.executeQuery();
			while (r.next())
				res.add(r.getString("nom"));
			st.close();
			r.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return res;
		}
		//Consulter les activités proposées dans les sites proches d’un l’hôtel donné (spécifié en paramètre)
		public ArrayList<String> consulter(String x) {
			String query = "select * from activiteparsite where  nomsite=  ? ";
			ArrayList<String>  res = new ArrayList<String>();
			PreparedStatement st = null;
			ResultSet r = null;
			try {
				st = this.Connect.prepareStatement(query);
				st.setString(1, x);
				r = st.executeQuery();
				while (r.next())
					res.add(r.getString("nomactivite"));
				st.close();
				r.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			return res;
			}
	//Faire une réservation dans un hôtel
		public boolean inserer(reserver_hotel r) { 
			String query = "INSERT INTO reserver_hotel (   visiteur,  hotel , date_res, date_fin) VALUES (?, ?, ?, ?) ";
			PreparedStatement st = null;
			boolean b=false;
			int t;
			try {
				st = this.Connect.prepareStatement(query);
				st.setString(1, r.getVisiteur());
				st.setString(2, r.getHotel());
				st.setDate(3, r.getDate_res());
				st.setDate(4, r.getDate_fin());
				t = st.executeUpdate();
				if (t!=0)
					b=true;
				st.close();
				
			} catch (SQLException e) {
			e.printStackTrace();
			}
			return b;
			}	
		
	//	Annuler une réservation
		
		public boolean cancelReservation(annulation r) {
			String query = "update reserver_hotel delete row where  hotel= " + r.getHotel()+"and visiteu="+r.getVisiteur(); 
			PreparedStatement st = null;
			boolean b=false;
			int t;
			try {
				st = this.Connect.prepareStatement(query);
				t = st.executeUpdate();
				
				if (t!=0)
					b=true;
				st.close();
				
			
			} catch (SQLException e) {
				e.printStackTrace();
			
			}
			return b;
		}
		
		}
