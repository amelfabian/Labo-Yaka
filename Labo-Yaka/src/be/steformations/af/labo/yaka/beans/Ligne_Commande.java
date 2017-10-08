package be.steformations.af.labo.yaka.beans;

import javax.faces.bean.ManagedBean;

import org.springframework.web.bind.annotation.RequestMapping;

public class Ligne_Commande {
	private int id;
	private Commande fk_commande;
	private Prix fk_prix;
	private int quantite;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Commande getFk_commande() {
		return fk_commande;
	}
	public void setFk_commande(Commande fk_commande) {
		this.fk_commande = fk_commande;
	}

	
	public Prix getFk_prix() {
		return fk_prix;
	}
	public void setFk_prix(Prix fk_prix) {
		this.fk_prix = fk_prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fk_prix == null) ? 0 : fk_prix.hashCode());
		result = prime * result + ((fk_commande == null) ? 0 : fk_commande.hashCode());
		result = prime * result + id;
		result = prime * result + quantite;
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
		Ligne_Commande other = (Ligne_Commande) obj;
		if (fk_prix == null) {
			if (other.fk_prix != null)
				return false;
		} else if (!fk_prix.equals(other.fk_prix))
			return false;
		if (fk_commande == null) {
			if (other.fk_commande != null)
				return false;
		} else if (!fk_commande.equals(other.fk_commande))
			return false;
		if (id != other.id)
			return false;
		if (quantite != other.quantite)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Ligne_Commande [id=" + id + ", fk_commande=" + fk_commande + ", fk_article=" + fk_prix
				+ ", quantite=" + quantite + "]";
	}
	
	
}

	
