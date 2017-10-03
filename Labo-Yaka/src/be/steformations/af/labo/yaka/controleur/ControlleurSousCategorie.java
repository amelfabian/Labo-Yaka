package be.steformations.af.labo.yaka.controleur;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.springframework.web.bind.annotation.RequestMapping;

import be.steformations.af.labo.yaka.beans.Produits;
import be.steformations.af.labo.yaka.beans.SousCategories;
import be.steformations.af.labo.yaka.model.GestionnaireYaka;
import be.steformations.af.labo.yaka.session.SessionProduit;
import be.steformations.af.labo.yaka.session.SessionSSCat;

@ManagedBean
@RequestMapping
public class ControlleurSousCategorie {
	@ManagedProperty(value = "#{gestionnaireYaka}")
	private GestionnaireYaka gestionnaire;
	@ManagedProperty(value = "#{sessionProduit}")
	private SessionProduit sessionP;
	private String sscat;
	private List<Produits> var;

	public ControlleurSousCategorie() {
		System.out.println("ControlleurSousCategorie.ControlleurSousCategorie()");
	}

	public GestionnaireYaka getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(GestionnaireYaka gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public String getSousCategories() {
		System.out.println("ControlleurSousCategorie.getSousCategories()" + sscat);
		return this.sscat;
	}

	public void setSousCategories(String sscat) {
		System.out.println("ControlleurSousCategorie.setSousCategories()" + sscat);
		this.sscat = sscat;
	}

	public String bouttonSSCat() {
		System.out.println("ControlleurSousCategorie.boutonSSCat()" + sscat);
		int id = Integer.parseInt(sscat);
		this.var = this.gestionnaire.getProduitBySsCat(id);
		sessionP.setVar(var);
		return "produits";
	}

	public SessionProduit getSessionP() {
		return sessionP;
	}

	public void setSessionP(SessionProduit sessionP) {
		this.sessionP = sessionP;
	}

}
