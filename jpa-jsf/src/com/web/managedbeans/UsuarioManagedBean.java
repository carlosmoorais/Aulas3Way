package com.web.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.web.dao.UsuarioDao;
import com.web.model.Usuario;
import com.web.service.UsuarioService;

@ManagedBean
@ViewScoped
public class UsuarioManagedBean {

	private final String TELA_NOVO_USUARIO = "/restrito/novoUsuario.xhtml?faces-redirect=true";
	private final String TELA_LISTAGEM_USUARIO = "/restrito/listagemUsuarios?faces-redirect=true";
	
	private UsuarioDao usuarioDao = new UsuarioDao();
	private Usuario usuario = new Usuario();

	@ManagedProperty("#{usuarioService}")
	private UsuarioService usuarioService;
	
	@PostConstruct
	public void init() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		String idUsuario = facesContext.getExternalContext().getRequestParameterMap().get("id");
		if (idUsuario != null) {
			this.usuario = usuarioDao.consultarUsuario(Integer.parseInt(idUsuario));
		}
	}

	public List usuarioListDb() {
		return usuarioDao.listarUsuario();
	}

	public void excluirUsuarioDb(Usuario usuario) {
		usuarioDao.deletarUsuario(usuario);
	}

	public String incluirUsuarioDb(Usuario usuario) {
		try {
			getUsuarioService().salvarUsuario(usuario);
			return TELA_LISTAGEM_USUARIO;
		} catch (Exception e) {
			e.printStackTrace();
			
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), ""));
			context.getExternalContext().getFlash().setKeepMessages(true);
			
			return TELA_NOVO_USUARIO;
		}
	}
	
	public String editarUsuarioDb(Usuario usuario) {
		usuarioDao.alterarUsuario(usuario);
		return TELA_LISTAGEM_USUARIO;
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

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
}