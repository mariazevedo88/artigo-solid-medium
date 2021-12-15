package io.github.mariazevedo88.solid.lsp;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TesteLSP {
	
	private static final Logger log = LogManager.getLogger(TesteLSP.class);

	public static void main(String[] args) {
		
		List<ContaCorrenteComum> listaDeContasComum = populaListaContaCorrenteComum();
		List<ContaSalario> listaDeContasSalario = populaListaContaSalario();
		
		listaDeContasComum.stream().forEach(ContaCorrenteComum::rende);
		listaDeContasComum.stream().forEach(log::info);
		
		listaDeContasSalario.stream().forEach(log::info);
	}
	
	private static List<ContaCorrenteComum> populaListaContaCorrenteComum() {
		
		ContaCorrenteComum conta1 = new ContaCorrenteComum();
		conta1.deposita(680.10);
		
		ContaCorrenteComum conta2 = new ContaCorrenteComum();
		conta2.deposita(855.45);
		
		ContaCorrenteComum conta3 = new ContaCorrenteComum();
		conta3.deposita(246.87);
		
		return Arrays.asList(conta1, conta2, conta3);
	}
	
	private static List<ContaSalario> populaListaContaSalario() {
		
		ContaSalario contaSalario1 = new ContaSalario();
		contaSalario1.deposita(469.30);
		
		ContaSalario contaSalario2 = new ContaSalario();
		contaSalario2.deposita(148.90);
		
		return Arrays.asList(contaSalario1, contaSalario2);
	}

}
