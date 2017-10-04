package be.steformations.af.labo.yaka.controleur;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.springframework.web.bind.annotation.RequestMapping;

import be.steformations.af.labo.yaka.beans.Caracteristique;
import be.steformations.af.labo.yaka.model.GestionnaireYaka;
import be.steformations.af.labo.yaka.session.SessionCaracteristiques;
@ManagedBean
@RequestMapping
public class ControlleurCaracteristiques {
			
			@ManagedProperty(value = "#{gestionnaireYaka}")
			private GestionnaireYaka gestionnaire;
			@ManagedProperty(value = "#{sessionCaracteristiques}")
			private SessionCaracteristiques session;
			private int id;
			private List<Caracteristique> listCar;
			

		public ControlleurCaracteristiques() {
			super();
			System.out.println("ControlleurCaracteristiques.ControlleurCaracteristiques()");
			
		}
		
		public String actionCaracteristiques(){
			System.out.println("ControlleurCaracteristiques.actionCaracteristiques()");
			this.listCar = this.gestionnaire.getCaracteristiquesByProduits(id);
			session.setVarCar(listCar);
			return "caracteristiquesDetail";
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

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public List<Caracteristique> getListCar() {
			return listCar;
		}

		public void setListCar(List<Caracteristique> listCar) {
			this.listCar = listCar;
		}
		
		
}
