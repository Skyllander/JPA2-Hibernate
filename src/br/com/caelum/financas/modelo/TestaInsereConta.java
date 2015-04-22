package br.com.caelum.financas.modelo;

import javax.persistence.EntityManager;

public class TestaInsereConta {

	public static void main(String []args){
		
		Conta conta = new Conta();
		conta.setTitular("Saul");
		conta.setBanco("Brasil");
		conta.setNumero("758941");
		conta.setAgencia("857");
		
		EntityManager em = new JPAUtil().getEntityManager();
		ContaDAO dao = new ContaDAO(em);
		
		em.getTransaction().begin();
		dao.adiciona(conta);
		em.getTransaction().commit();
		em.close();
		
	}
}