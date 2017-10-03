package be.steformations.af.labo.yaka.session;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import be.steformations.af.labo.yaka.beans.Produits;
@ManagedBean
@SessionScoped
public class SessionProduit {

		private List<Produits> var;
		public SessionProduit() {
			super();
			System.out.println("SessionProduit.SessionProduit()");
		}
		public List<Produits> getVar() {
			return var;
		}
		public void setVar(List<Produits> var) {
			this.var = var;
		}
		
		
		
}
