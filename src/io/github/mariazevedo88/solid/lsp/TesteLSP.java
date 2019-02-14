package io.github.mariazevedo88.solid.lsp;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

public class TesteLSP {
	
	private static final Logger logger = Logger.getLogger(TesteLSP.class);

	public static void main(String[] args) {
		
		List<ContaCorrenteComum> listaDeContasComum = populaListaContaCorrenteComum();
		List<ContaSalario> listaDeContasSalario = populaListaContaSalario();
		
		listaDeContasComum.stream().forEach(ContaCorrenteComum::rende);
		listaDeContasComum.stream().forEach(logger::info);
		
		listaDeContasSalario.stream().forEach(logger::info);
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
