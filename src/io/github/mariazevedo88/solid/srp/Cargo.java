package io.github.mariazevedo88.solid.srp;

public enum Cargo {

	DESENVOLVEDOR_SENIOR(new RegraVinteDoisEMeioPorcento()),
	DESENVOLVEDOR_JUNIOR(new RegraOnzePorcento());
	
	private RegraDeCalculo regra;
	
	private Cargo (RegraDeCalculo regra){
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
	
}
