package be.steformations.af.labo.yaka.session;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import be.steformations.af.labo.yaka.beans.Caracteristique;
import be.steformations.af.labo.yaka.beans.Produits;

@ManagedBean
@SessionScoped
public class SessionCaracteristiques {
			private Produits var;
			private List<Caracteristique> varCar;
		public List<Caracteristique> getVarCar() {
				return varCar;
			}

			public void setVarCar(List<Caracteristique> varCar) {
				this.varCar = varCar;
			}

		public SessionCaracteristiques() {
			super();
			System.out.println("SessionCaracteristiques.SessionCaracteristiques()");
	
		}
		
		public void setVar(Produits var) {
			this.var = var;
		}
		
		public Produits getVar() {
			return var;
		}
}
