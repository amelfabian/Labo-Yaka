package be.steformations.af.labo.yaka.beans;

import java.sql.Date;

public class Commande {
	private int id ;
	private Date date;
	private String facture;
	private Clients fk_clients;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFacture() {
		return facture;
	}
	public void setFacture(String facture) {
		this.facture = facture;
	}
	public Clients getFk_clients() {
		return fk_clients;
	}
	public void setFk_clients(Clients fk_clients) {
		this.fk_clients = fk_clients;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((facture == null) ? 0 : facture.hashCode());
		result = prime * result + ((fk_clients == null) ? 0 : fk_clients.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commande other = (Commande) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (facture == null) {
			if (other.facture != null)
				return false;
		} else if (!facture.equals(other.facture))
			return false;
		if (fk_clients == null) {
			if (other.fk_clients != null)
				return false;
		} else if (!fk_clients.equals(other.fk_clients))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Commande [id=" + id + ", date=" + date + ", facture=" + facture + ", fk_clients=" + fk_clients + "]";
	}
	
	
	
}
