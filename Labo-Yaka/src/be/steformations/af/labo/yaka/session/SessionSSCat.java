package be.steformations.af.labo.yaka.session;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import be.steformations.af.labo.yaka.beans.SousCategories;
import be.steformations.af.labo.yaka.model.GestionnaireYaka;
@ManagedBean
@SessionScoped
public class SessionSSCat {

				List<SousCategories> var;
				
				public SessionSSCat() {
					super();
					System.out.println("SessionSSCat.SessionSSCat()");
				}
				
		public List<SousCategories> getVar() {
				return var;
			}

			public void setVar(List<SousCategories> var) {
				this.var = var;
			}

		
		}
