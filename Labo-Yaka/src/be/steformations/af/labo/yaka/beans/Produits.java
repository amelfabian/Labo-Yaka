package be.steformations.af.labo.yaka.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.web.bind.annotation.RequestMapping;

public class Produits {
	
	private int id;
	private String nom;
	private String vignette;
	private String image;
	private String descr_courte;
	private String descr_longue;
	private int stat;
	private SousCategories sous_categorie_fk;
	//private List<Caracteristique> caracteristiques;
	
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
	public String getVignette() {
		return vignette;
	}
	public void setVignette(String vignette) {
		this.vignette = vignette;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescr_courte() {
		return descr_courte;
	}
	public void setDescr_courte(String descr_courte) {
		this.descr_courte = descr_courte;
	}
	public String getDescr_longue() {
		return descr_longue;
	}
	public void setDescr_longue(String descr_longue) {
		this.descr_longue = descr_longue;
	}
	public int getStat() {
		return stat;
	}
	public void setStat(int stat) {
		this.stat = stat;
	}
	public SousCategories getSous_categorie_fk() {
		return sous_categorie_fk;
	}
	public void setSous_categorie_fk(SousCategories sous_categorie_fk) {
		this.sous_categorie_fk = sous_categorie_fk;
	}
//	public List<Caracteristique> getCaracteristiques() {
//		return caracteristiques;
//	}
//	public void setCaracteristiques(List<Caracteristique> caracteristiques) {
//		this.caracteristiques = caracteristiques;
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
	//	result = prime * result + ((caracteristiques == null) ? 0 : caracteristiques.hashCode());
		result = prime * result + ((descr_courte == null) ? 0 : descr_courte.hashCode());
		result = prime * result + ((descr_longue == null) ? 0 : descr_longue.hashCode());
		result = prime * result + id;
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((sous_categorie_fk == null) ? 0 : sous_categorie_fk.hashCode());
		result = prime * result + stat;
		result = prime * result + ((vignette == null) ? 0 : vignette.hashCode());
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
		Produits other = (Produits) obj;
//		if (caracteristiques == null) {
//			if (other.caracteristiques != null)
//				return false;
//		} else if (!caracteristiques.equals(other.caracteristiques))
//			return false;
		if (descr_courte == null) {
			if (other.descr_courte != null)
				return false;
		} else if (!descr_courte.equals(other.descr_courte))
			return false;
		if (descr_longue == null) {
			if (other.descr_longue != null)
				return false;
		} else if (!descr_longue.equals(other.descr_longue))
			return false;
		if (id != other.id)
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (sous_categorie_fk == null) {
			if (other.sous_categorie_fk != null)
				return false;
		} else if (!sous_categorie_fk.equals(other.sous_categorie_fk))
			return false;
		if (stat != other.stat)
			return false;
		if (vignette == null) {
			if (other.vignette != null)
				return false;
		} else if (!vignette.equals(other.vignette))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Produits [id=" + id + ", nom=" + nom + ", vignette=" + vignette + ", image=" + image + ", descr_courte="
				+ descr_courte + ", descr_longue=" + descr_longue + ", stat=" + stat;// + ", sous_categorie_fk="
		//		+ sous_categorie_fk + ", caracteristiques=" + caracteristiques + "]";
	}
	
	

}
