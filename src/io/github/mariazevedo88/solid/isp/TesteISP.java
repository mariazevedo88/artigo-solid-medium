package io.github.mariazevedo88.solid.isp;

import org.apache.log4j.Logger;

public class TesteISP {
	
	private static final Logger logger = Logger.getLogger(TesteISP.class);
	
	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor(3000, 52);
		logger.info(vendedor);
		
		Funcionario desenvolvedorSoftware = new Desenvolvedor("Mariana", 4000);
		logger.info(desenvolvedorSoftware);
	}

}
