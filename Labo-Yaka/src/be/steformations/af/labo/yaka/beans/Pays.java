package be.steformations.af.labo.yaka.beans;

import javax.faces.bean.ManagedBean;

import org.springframework.web.bind.annotation.RequestMapping;


public class Pays {
	private String Pays_abbreviations;
	private String nom;
	public String getPays_abbreviations() {
		return Pays_abbreviations;
	}
	public void setPays_abbreviations(String pays_abbreviations) {
		Pays_abbreviations = pays_abbreviations;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Pays_abbreviations == null) ? 0 : Pays_abbreviations.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Pays other = (Pays) obj;
		if (Pays_abbreviations == null) {
			if (other.Pays_abbreviations != null)
				return false;
		} else if (!Pays_abbreviations.equals(other.Pays_abbreviations))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pays [Pays_abbreviations=" + Pays_abbreviations + ", nom=" + nom + "]";
	}
	
	
}
