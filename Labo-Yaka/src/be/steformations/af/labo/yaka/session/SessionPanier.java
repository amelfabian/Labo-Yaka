package be.steformations.af.labo.yaka.session;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SessionPanier {
	
		private int var;
	
		public SessionPanier() {
			super();
			System.out.println("SessionPanier.SessionPanier()");
		}
		public int getVar() {
			return var;
		}
		public void setVar(int var) {
			this.var = var;
		}
	
		
}
