package io.github.mariazevedo88.solid.ocp.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.mariazevedo88.solid.ocp.CalculadoraDePrecos;
import io.github.mariazevedo88.solid.ocp.Frete;
import io.github.mariazevedo88.solid.ocp.Produto;
import io.github.mariazevedo88.solid.ocp.ServicoDeFrete;
import io.github.mariazevedo88.solid.ocp.TabelaDePreco;
import io.github.mariazevedo88.solid.ocp.TabelaDePrecoAPrazo;
import io.github.mariazevedo88.solid.ocp.TabelaDePrecoAVista;

public class OCPTest {

	@Test
	public void deveCalcularPrecosComDoisProdutos(){
		 
		TabelaDePreco tabela1 = new TabelaDePrecoAVista();
	    ServicoDeFrete entrega1 = new Frete();
	    
	    CalculadoraDePrecos calculadora1 = new CalculadoraDePrecos(tabela1, entrega1);
	    double preco1 = calculadora1.calcula(new Produto("Notebook", 1200.0, "minas gerais"));
	    double precoEsperado1 = 1212.5; 
	    	     
	    TabelaDePreco tabela2 = new TabelaDePrecoAPrazo();
	    ServicoDeFrete entrega2 = new Frete();
	     
	    CalculadoraDePrecos calculadora2 = new CalculadoraDePrecos(tabela2, entrega2);
	    double preco2 = calculadora2.calcula(new Produto("Monitor 21'", 719.0, "sao paulo"));
	    double precoEsperado2 = 690.55;  
	    
	    assertEquals(precoEsperado1, preco1, 0.0001);
	    assertEquals(precoEsperado2, preco2, 0.0001);
	}
}
