package com.web.teste;

import com.web.dao.ClienteDao;
import com.web.modelo.Cliente;

public class TestaDado {
	public static void main(String[] args) {
		ClienteDao clienteDao = new ClienteDao();

		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente("Jorge", "vvvv", "jorgev", "goias", "goiania", "vila luzia");
		

		cliente1.setSenha("xxxx");
		cliente1.setLogin("carlosx");
//
//		cliente2.setSenha("yyyy");
//		cliente2.setLogin("mariay");
//
//		clienteDao.obter(cliente1);
//		System.out.println(cliente1);
//
//		clienteDao.obter(cliente2);
//		System.out.println(cliente2);
//		
//		clienteDao.inserir(cliente3);
//		
		cliente3 = clienteDao.obter(cliente1);
//		cliente3.setBairro("jd da luz");
//		clienteDao.alterar(cliente3);
		
		clienteDao.remover(cliente3);
		System.out.println(cliente3);
	}
}
