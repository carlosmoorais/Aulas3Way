package com.web.service;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.xml.bind.ValidationException;

import com.web.dao.EnderecoDao;
import com.web.model.Endereco;

@ManagedBean(name = "enderecoService")
@ApplicationScoped
public class EnderecoService {

	private EnderecoDao enderecoDao = new EnderecoDao();

	public void salvarEndereco(Endereco endereco) throws ValidationException {
		enderecoDao.inserirEndereco(endereco);
	}

	public void editarEndereco(Endereco endereco) throws ValidationException {
		enderecoDao.alterarEndereco(endereco);
	}

	public List listarEndereco() {
		return enderecoDao.listarEndereco();
	}

	public void deletarEndereco(Endereco endereco) {
		enderecoDao.deletarEndereco(endereco);
	}

}
