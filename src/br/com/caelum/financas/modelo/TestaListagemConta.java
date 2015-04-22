package br.com.caelum.financas.modelo;

import java.util.List;

import javax.persistence.EntityManager;

public class TestaListagemConta {
	
	public static void main(String []args) {
		EntityManager em = new JPAUtil().getEntityManager();
		ContaDAO dao = new ContaDAO(em);
		
		List<Conta> lista = dao.lista();
		
		for (Conta conta : lista){
			System.out.println(conta.getNumero());
		}
	}

	
}