package com.web.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.web.dao.UsuarioDao;
import com.web.model.Usuario;

@ManagedBean
@ViewScoped
public class UsuarioManagedBean {

	private UsuarioDao usuarioDao = new UsuarioDao();
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarioListDb = new ArrayList<>();

	@PostConstruct
	public void init() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		String idUsuario = facesContext.getExternalContext().getRequestParameterMap().get("id");
		if (idUsuario != null) {
			this.usuario = usuarioDao.consultarUsuario(Integer.parseInt(idUsuario));
		}
	}

	public List getUsuarioListDb() {
		return usuarioDao.listarUsuario();
	}

	public void excluirUsuarioDb(Usuario usuario) {
		usuarioDao.deletarUsuario(usuario);
	}

	public String incluirUsuarioDb(Usuario usuario) {
		if(!usuarioDao.inserirUsuario(usuario)) {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro: Usuário já existe!", null));
			context.getExternalContext().getFlash().setKeepMessages(true);
			
			return "/restrito/novoUsuario.xhtml?faces-redirect=true";
		}

		return "/restrito/listagemUsuarios?faces-redirect=true";
	}
	
	public String editarUsuarioDb(Usuario usuario) {
		usuarioDao.alterarUsuario(usuario);
		return "/restrito/listagemUsuarios?faces-redirect=true";
	}

	public String paginaEditar(Usuario usuario) {
		return "/restrito/editarUsuario?faces-redirect=true&id=" + usuario.getId();
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}