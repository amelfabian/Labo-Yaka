package be.steformations.af.labo.yaka.beans;

import java.sql.Date;

public class Clients  {

	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String cp;
	private String localite;
	private Pays fk_pays;
	private String telephone;
	private String numero_carte;
	private Date Date_Echance;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getLocalite() {
		return localite;
	}
	public void setLocalite(String localite) {
		this.localite = localite;
	}
	public Pays getFk_pays() {
		return fk_pays;
	}
	public void setFk_pays(Pays fk_pays) {
		this.fk_pays = fk_pays;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getNumero_carte() {
		return numero_carte;
	}
	public void setNumero_carte(String numero_carte) {
		this.numero_carte = numero_carte;
	}
	public Date getDate_Echance() {
		return Date_Echance;
	}
	public void setDate_Echance(Date date_Echance) {
		Date_Echance = date_Echance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Date_Echance == null) ? 0 : Date_Echance.hashCode());
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((cp == null) ? 0 : cp.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fk_pays == null) ? 0 : fk_pays.hashCode());
		result = prime * result + id;
		result = prime * result + ((localite == null) ? 0 : localite.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((numero_carte == null) ? 0 : numero_carte.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
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
		Clients other = (Clients) obj;
		if (Date_Echance == null) {
			if (other.Date_Echance != null)
				return false;
		} else if (!Date_Echance.equals(other.Date_Echance))
			return false;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (cp == null) {
			if (other.cp != null)
				return false;
		} else if (!cp.equals(other.cp))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fk_pays == null) {
			if (other.fk_pays != null)
				return false;
		} else if (!fk_pays.equals(other.fk_pays))
			return false;
		if (id != other.id)
			return false;
		if (localite == null) {
			if (other.localite != null)
				return false;
		} else if (!localite.equals(other.localite))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numero_carte == null) {
			if (other.numero_carte != null)
				return false;
		} else if (!numero_carte.equals(other.numero_carte))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Clients [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", cp=" + cp
				+ ", localite=" + localite + ", fk_pays=" + fk_pays + ", telephone=" + telephone + ", numero_carte="
				+ numero_carte + ", Date_Echance=" + Date_Echance + ", email=" + email + "]";
	}
	
	
	
}
