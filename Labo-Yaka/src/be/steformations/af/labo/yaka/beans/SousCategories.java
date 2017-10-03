package be.steformations.af.labo.yaka.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Transient;

import org.springframework.web.bind.annotation.RequestMapping;

public class SousCategories {
	
	private int id;
	private String nom;
	private Categorie fk_categories;
	private int stat;
	@Transient
	private List<Produits> produits;
	
	public SousCategories() {
		super();
	}

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

	public Categorie getFk_categories() {
		return fk_categories;
	}

	public void setFk_categories(Categorie fk_categories) {
		this.fk_categories = fk_categories;
	}

	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
	}

	public List<Produits> getProduits() {
		return produits;
	}

	public void setProduits(List<Produits> produits) {
		this.produits = produits;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fk_categories == null) ? 0 : fk_categories.hashCode());
		result = prime * result + id;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((produits == null) ? 0 : produits.hashCode());
		result = prime * result + stat;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SousCategories other = (SousCategories) obj;
		if (fk_categories == null) {
			if (other.fk_categories != null)
				return false;
		} else if (!fk_categories.equals(other.fk_categories))
			return false;
		if (id != other.id)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (produits == null) {
			if (other.produits != null)
				return false;
		} else if (!produits.equals(other.produits))
			return false;
		if (stat != other.stat)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sous_Categories [id=" + id + ", nom=" + nom + ", fk_categories=" + fk_categories + ", stat=" + stat
				+ ", produits=" + produits + "]";
	}
	
	
	
	
	
}
