package be.steformations.af.labo.yaka.beans;

import javax.faces.bean.ManagedBean;

import org.springframework.web.bind.annotation.RequestMapping;


public class Categorie {
	private int id;
	private String nom;
	private int stat;
	
	
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
	public int getStat() {
		return stat;
	}
	public void setStat(int stat) {
		this.stat = stat;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + stat;
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
		Categorie other = (Categorie) obj;
		if (id != other.id)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (stat != other.stat)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nom=" + nom + ", stat=" + stat + "]";
	}
	
	
}
