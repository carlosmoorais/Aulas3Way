package com.framework.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.framework.model.Pessoa;

public class TestaPersistencia {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-exemplo");
		EntityManager entityManager = factory.createEntityManager();
		
//		Pessoa pessoa = new Pessoa();
//		pessoa.setCpf("02196481124");
//		pessoa.setNome("Luiz André");
//		
//		entityManager.getTransaction().begin();
//		entityManager.persist(pessoa);
//		entityManager.getTransaction().commit();
//		
		List<Pessoa> todasPessoasJPA = entityManager.createQuery("FROM " + Pessoa.class.getName()).getResultList();
		
		for(Pessoa pessoaLaco : todasPessoasJPA) {
			System.out.println(pessoaLaco);
		}
	}

}
