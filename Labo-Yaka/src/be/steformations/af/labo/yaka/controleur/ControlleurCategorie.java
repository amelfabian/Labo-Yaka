package be.steformations.af.labo.yaka.controleur;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.springframework.web.bind.annotation.RequestMapping;

import be.steformations.af.labo.yaka.beans.Categorie;
import be.steformations.af.labo.yaka.beans.SousCategories;
import be.steformations.af.labo.yaka.model.GestionnaireYaka;
import be.steformations.af.labo.yaka.session.SessionSSCat;

@ManagedBean
@RequestMapping
public class ControlleurCategorie {
	@ManagedProperty(value = "#{gestionnaireYaka}")
	private GestionnaireYaka gestionnaire;
	@ManagedProperty(value="#{sessionSSCat}")
	private SessionSSCat session;
	private String cat;
	private List<SousCategories> var;
	public ControlleurCategorie() {
		super();
		System.out.println("ControlleurCategorie.ControlleurCategorie()");
	}

	public GestionnaireYaka getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(GestionnaireYaka gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public String getCategories() {

		return this.cat;

	}
	
	public void setCategories(String cat){
		System.out.println("ControlleurCategorie.setCategories()" + cat);
		this.cat = cat;
	}


	public String actionBoutton(){
	 System.out.println("ControlleurCategorie.actionBouton()" + cat);
	 	int id = Integer.parseInt(cat);
		this.var = this.gestionnaire.getSousCategorieByIDCat(id);
		session.setVar(var);
		return "sousCategorie";
	}

	public SessionSSCat getSession() {
		System.out.println("ControlleurCategorie.getSession()");
		return session;
	}

	public void setSession(SessionSSCat session) {
		System.out.println("ControlleurCategorie.setSession()");
		this.session = session;
	}

	
	
}
