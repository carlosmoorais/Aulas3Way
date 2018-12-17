package com.web.service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.xml.bind.ValidationException;

import com.web.dao.UsuarioDao;
import com.web.model.Usuario;

@ManagedBean(name = "usuarioService")
@ApplicationScoped
public class UsuarioService {

	private UsuarioDao usuarioDao = new UsuarioDao();

	public void telaEdicao(Usuario usuario) throws ValidationException {
		if (!usuario.getMatricula().startsWith("ADM")) {
			throw new ValidationException("Somente usuário com perfil ADM podem acessar a página de ediçao");
		}
	}

	public void salvarUsuario(Usuario usuario) throws ValidationException {
		this.validarMatricula(usuario);
		 usuario.setSenha(this.encriptarSenha(usuario.getSenha()));
		if (!usuarioDao.inserirUsuario(usuario)) {
			throw new ValidationException("Usuario já existe");
		}
	}

	public String encriptarSenha(String senha) {
		String senhaRetorno = "";
		MessageDigest algorithm;
		try {
			algorithm = MessageDigest.getInstance("SHA-256");
			byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

			StringBuilder hexString = new StringBuilder();
			for (byte b : messageDigest) {
				hexString.append(String.format("%02X", 0xFF & b));
			}
			senhaRetorno = hexString.toString();
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return senhaRetorno;
	}

	public Usuario consultarUsuario(Integer idUsuario) {
		return usuarioDao.consultarUsuario(idUsuario);
	}

	public void mergeUsuario(Usuario usuario) {
		usuarioDao.alterarUsuario(usuario);
	}

	private void validarMatricula(Usuario usuario) throws ValidationException {
		if (!usuario.getMatricula().startsWith("M") && !usuario.getMatricula().startsWith("ADM")) {
			throw new ValidationException("A matrícula do usuário de iniciar com M ou ADM!");
		}
	}

	public void deletarUsuario(Usuario usuario) {
		usuarioDao.deletarUsuario(usuario);
	}

}
