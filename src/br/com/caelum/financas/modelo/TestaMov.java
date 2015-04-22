package br.com.caelum.financas.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

public class TestaMov {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta conta = new Conta();
		conta.setBanco("Santander");
		conta.setNumero("99999-9");
		conta.setAgencia("151");
		conta.setTitular("Maria");
		
		em.persist(conta);
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setConta(conta);
		movimentacao.setData(Calendar.getInstance());
		movimentacao.setDescricao("luz");
		movimentacao.setValor(new BigDecimal("100"));
		movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		
		em.persist(movimentacao);
		
		em.getTransaction().commit();
		em.close();
	}
	
}
