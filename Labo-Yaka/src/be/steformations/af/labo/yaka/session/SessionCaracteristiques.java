package be.steformations.af.labo.yaka.session;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SessionCaracteristiques {
			private String var;
		public SessionCaracteristiques() {
			super();
			System.out.println("SessionCaracteristiques.SessionCaracteristiques()");
	
		}
		
		public void setVar(String var) {
			this.var = var;
		}
		
		public String getVar() {
			return var;
		}
}
