package br.com.primefaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean (name ="mensagens")
public class MensagensPrime {

	public void info() {
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Mensagem informando"));
	}
	
	public void erro() {
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Ocorreu um erro."));
	}
	
	public void aviso() {
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Isto é um aviso"));
	}
	
	public void fatal() {
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal", "Aplicação parou!"));
	}
}
