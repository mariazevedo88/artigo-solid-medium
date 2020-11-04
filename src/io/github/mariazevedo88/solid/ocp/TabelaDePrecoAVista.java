package io.github.mariazevedo88.solid.ocp;

public class TabelaDePrecoAVista implements TabelaDePreco{

	@Override
	public double calculaDesconto(double valor) {
		if(valor < 100.0) {
			return 0.05;
		}else if(valor > 100.0 && valor < 500.0) {
			return 0.07;
		}else if(valor > 500.0 && valor < 1000.0) {
			return 0.10;
		}else {
			return 0.15;
		}
	}

}
