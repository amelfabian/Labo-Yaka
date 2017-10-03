package be.steformations.af.labo.yaka.session;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import be.steformations.af.labo.yaka.beans.Produits;

@ManagedBean
@SessionScoped
public class SessionCaracteristiques {
			private Produits var;
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
