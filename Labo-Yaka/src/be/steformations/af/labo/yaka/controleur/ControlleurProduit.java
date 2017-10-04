package be.steformations.af.labo.yaka.controleur;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.springframework.web.bind.annotation.RequestMapping;

import be.steformations.af.labo.yaka.beans.Caracteristique;
import be.steformations.af.labo.yaka.beans.Produits;
import be.steformations.af.labo.yaka.model.GestionnaireYaka;
import be.steformations.af.labo.yaka.session.SessionCaracteristiques;

@ManagedBean
@RequestMapping
public class ControlleurProduit {

	@ManagedProperty(value = "#{gestionnaireYaka}")
	private GestionnaireYaka gestionnaire;
	@ManagedProperty(value = "#{sessionCaracteristiques}")
	private SessionCaracteristiques session;
	private String produits;
	private Produits var;

	public ControlleurProduit() {
		super();
		System.out.println("ControlleurProduit.ControlleurProduit()" + produits);

	}

	public String actionBoutton() {
		System.out.println("ControlleurProduit.actionBoutton() " + produits);
		int id = Integer.parseInt(produits);
		this.var = this.gestionnaire.getProduit(id);
		session.setVar(var);
		return "articles";
	}

	public String getProduits() {
		return produits;
	}

	public void setProduits(String produits) {
		System.out.println("ControlleurProduit.setProduits()" + produits);
		this.produits = produits;
	}

	public GestionnaireYaka getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(GestionnaireYaka gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public SessionCaracteristiques getSession() {
		return session;
	}

	public void setSession(SessionCaracteristiques session) {
		this.session = session;
	}

}
