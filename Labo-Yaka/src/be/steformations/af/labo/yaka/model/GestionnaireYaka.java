package be.steformations.af.labo.yaka.model;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import javax.persistence.EntityManager;

import javax.persistence.Persistence;

import be.steformations.af.labo.yaka.beans.Caracteristique;
import be.steformations.af.labo.yaka.beans.Categorie;
import be.steformations.af.labo.yaka.beans.Prix;
import be.steformations.af.labo.yaka.beans.Produits;
import be.steformations.af.labo.yaka.beans.Proprietes;
import be.steformations.af.labo.yaka.beans.SousCategories;

@ManagedBean
@ApplicationScoped
public class GestionnaireYaka {
	
	private EntityManager em;

	public GestionnaireYaka() {
		super();
		this.em = Persistence.createEntityManagerFactory("postgresql_eclipselink").createEntityManager();
	}
	
	
	public List<Categorie> getAllCategories(){
	
		return this.em.createNamedQuery("getAllCategories",Categorie.class).getResultList();
		
	}
	
	public List<SousCategories> getSousCategorieByIDCat(int id){
		System.out.println("GestionnaireYaka.getSousCategorieByIDCat()" + id);
		return this.em.createNamedQuery("getSousCategorieByIDCat",SousCategories.class).setParameter(1, id).getResultList();
	}
	
	public List<Produits> getProduitBySsCat(int id){
		System.out.println("GestionnaireYaka.getProduitBySsCat()" + id);
		return this.em.createNamedQuery("getProduitByIDSsCat", Produits.class).setParameter("id", id).getResultList();
		
	}
	
	public Produits getProduit(int id){
		System.out.println("GestionnaireYaka.getProduit()" + id);
		
		return this.em.createNamedQuery("getProduit",Produits.class).setParameter(1, id).getSingleResult();
		
	}
	
	
	
	public List<Caracteristique> getCaracteristiquesByProduits(int id){
		System.out.println("GestionnaireYaka.getCaracteristiquesByProduits()");
		return this.em.createNamedQuery("getCaracteristiquesByProduits",Caracteristique.class).setParameter(1, id).getResultList();
	}
	
	public List<Prix> getPrixByCaracteristiques(){
		return null;
	}
	
	
}
