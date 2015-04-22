package br.com.caelum.financas.modelo;

import javax.persistence.EntityManager;

public class TestaBuscaContaDaMovimentacao {
	
	public static void main (String []args){
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Movimentacao m = em.getReference(Movimentacao.class, 3);
		System.out.println(m.getConta().getTitular());
		
	}
}