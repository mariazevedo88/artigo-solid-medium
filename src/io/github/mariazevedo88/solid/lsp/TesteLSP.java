package io.github.mariazevedo88.solid.lsp;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class TesteLSP {
	
	private static final Logger logger = Logger.getLogger(TesteLSP.class);

	public static void main(String[] args) {
		
		List<ContaCorrenteComum> listaDeContas = new ArrayList<>();
		
		ContaCorrenteComum contaComum = new ContaCorrenteComum();
		contaComum.deposita(680.10);
		listaDeContas.add(contaComum);
		
		for (ContaCorrenteComum conta : listaDeContas) {
            conta.rende();
            logger.info("Novo Saldo: " + conta.getSaldo());
        }
	}

}
