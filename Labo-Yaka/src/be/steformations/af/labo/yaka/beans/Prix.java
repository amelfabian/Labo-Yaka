package be.steformations.af.labo.yaka.beans;

import java.util.List;

public class Prix {
	private int id;
	private float tva_euro;
	private float vol_conditionnement;
	private List<Caracteristique> caract�ristiques;

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
	public List<Caracteristique> getCaract�ristiques() {
		return caract�ristiques;
	}
	public void setCaract�ristiques(List<Caracteristique> caract�ristiques) {
		this.caract�ristiques = caract�ristiques;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caract�ristiques == null) ? 0 : caract�ristiques.hashCode());
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
		Prix other = (Prix) obj;
		if (caract�ristiques == null) {
			if (other.caract�ristiques != null)
				return false;
		} else if (!caract�ristiques.equals(other.caract�ristiques))
			return false;
		if (id != other.id)
			return false;
		if (Float.floatToIntBits(tva_euro) != Float.floatToIntBits(other.tva_euro))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", tva_euro=" + tva_euro + ", caract�ristiques=" + caract�ristiques + "]";
	}
	public float getVol_conditionnement() {
		return vol_conditionnement;
	}
	public void setVol_conditionnement(float vol_conditionnement) {
		this.vol_conditionnement = vol_conditionnement;
	}
	
	


	
}
