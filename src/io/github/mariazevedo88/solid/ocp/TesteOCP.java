package io.github.mariazevedo88.solid.ocp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TesteOCP {
	
	private static final Logger log = LogManager.getLogger(TesteOCP.class);

	public static void main(String[] args)  {
		 
		 TabelaDePreco tabela1 = new TabelaDePrecoAVista();
	     ServicoDeFrete entrega1 = new Frete();
	     
	     CalculadoraDePrecos calculadora1 = new CalculadoraDePrecos(tabela1, entrega1);
	     double preco1 = calculadora1.calcula(new Produto("Notebook", 1200.0, "minas gerais"));
	     
	     log.info(preco1);
	     
	     TabelaDePreco tabela2 = new TabelaDePrecoAPrazo();
	     ServicoDeFrete entrega2 = new Frete();
	     
	     CalculadoraDePrecos calculadora2 = new CalculadoraDePrecos(tabela2, entrega2);
	     double preco2 = calculadora2.calcula(new Produto("Monitor 21'", 719.0, "sao paulo"));
	     
	     log.info(preco2);
	}
}
