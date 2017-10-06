package be.steformations.af.labo.yaka.session;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import be.steformations.af.labo.yaka.beans.Caracteristique;
import be.steformations.af.labo.yaka.beans.Produits;
import be.steformations.af.labo.yaka.beans.SousCategories;
@ManagedBean
@SessionScoped
public class SessionClient {
	
	private Produits var;
	private List<Caracteristique> varCar;
	private int varPan;
	private List<Produits> varProd;
	List<SousCategories> varSSCat;
	
	public SessionClient() {
		super();
		System.out.println("SessionClient.SessionClient()");
		
	}

	public Produits getVar() {
		return var;
	}

	public void setVar(Produits var) {
		this.var = var;
	}

		public List<Caracteristique> getVarCar() {
			return varCar;
		}

	public void setVarCar(List<Caracteristique> varCar) {
		this.varCar = varCar;
	}

	public int getVarPan() {
		return varPan;
	}

	public void setVarPan(int varPan) {
		this.varPan = varPan;
	}

	public List<Produits> getVarProd() {
		return varProd;
	}

	public void setVarProd(List<Produits> varProd) {
		this.varProd = varProd;
	}

	public List<SousCategories> getVarSSCat() {
		return varSSCat;
	}

	public void setVarSSCat(List<SousCategories> varSSCat) {
		this.varSSCat = varSSCat;
	}
	
	
	
}
