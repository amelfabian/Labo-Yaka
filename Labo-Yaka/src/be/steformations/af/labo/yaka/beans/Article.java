package be.steformations.af.labo.yaka.beans;

import java.util.List;

public class Article {
	private int id;
	private float tva_euro;
	private List<Caracteristique> caractéristiques;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getTva_euro() {
		return tva_euro;
	}
	public void setTva_euro(float tva_euro) {
		this.tva_euro = tva_euro;
	}
	public List<Caracteristique> getCaractéristiques() {
		return caractéristiques;
	}
	public void setCaractéristiques(List<Caracteristique> caractéristiques) {
		this.caractéristiques = caractéristiques;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caractéristiques == null) ? 0 : caractéristiques.hashCode());
		result = prime * result + id;
		result = prime * result + Float.floatToIntBits(tva_euro);
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
		Article other = (Article) obj;
		if (caractéristiques == null) {
			if (other.caractéristiques != null)
				return false;
		} else if (!caractéristiques.equals(other.caractéristiques))
			return false;
		if (id != other.id)
			return false;
		if (Float.floatToIntBits(tva_euro) != Float.floatToIntBits(other.tva_euro))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", tva_euro=" + tva_euro + ", caractéristiques=" + caractéristiques + "]";
	}
	
	


	
}
