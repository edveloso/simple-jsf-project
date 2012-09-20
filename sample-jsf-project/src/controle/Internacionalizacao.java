package controle;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;


@SessionScoped
@ManagedBean(name="i18n")
public class Internacionalizacao {
  
	public void mudaPais(){
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        String newLocale = externalContext.getRequestParameterMap().get("locale");
        Locale locale = new Locale(newLocale);
		FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
	}
	
	

	
	
}
