package be.steformations.af.labo.yaka.beans;

import javax.faces.bean.ManagedBean;

import org.springframework.web.bind.annotation.RequestMapping;


public class Caracteristique  {

		private int id;
		private Produits fk_produits;
		private Proprietes fk_proprietes;
		private String valeur;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Produits getFk_produits() {
			return fk_produits;
		}
		public void setFk_produits(Produits fk_produits) {
			this.fk_produits = fk_produits;
		}
		public Proprietes getFk_proprietes() {
			return fk_proprietes;
		}
		public void setFk_proprietes(Proprietes fk_proprietes) {
			this.fk_proprietes = fk_proprietes;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((fk_produits == null) ? 0 : fk_produits.hashCode());
			result = prime * result + ((fk_proprietes == null) ? 0 : fk_proprietes.hashCode());
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
			Caracteristique other = (Caracteristique) obj;
			if (fk_produits == null) {
				if (other.fk_produits != null)
					return false;
			} else if (!fk_produits.equals(other.fk_produits))
				return false;
			if (fk_proprietes == null) {
				if (other.fk_proprietes != null)
					return false;
			} else if (!fk_proprietes.equals(other.fk_proprietes))
				return false;
			if (id != other.id)
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Caracteristique [id=" + id + ", fk_produits=" + fk_produits + ", fk_proprietes=" + fk_proprietes
					+ "]";
		}
		public String getValeur() {
			return valeur;
		}
		public void setValeur(String valeur) {
			this.valeur = valeur;
		}
		
		
}
