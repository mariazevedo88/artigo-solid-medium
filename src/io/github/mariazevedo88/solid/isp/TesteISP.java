package io.github.mariazevedo88.solid.isp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TesteISP {
	
	private static final Logger log = LogManager.getLogger(TesteISP.class);
	
	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor(3000, 52);
		log.info(vendedor);
		
		Funcionario desenvolvedorSoftware = new Desenvolvedor("Mariana", 4000);
		log.info(desenvolvedorSoftware);
	}

}
