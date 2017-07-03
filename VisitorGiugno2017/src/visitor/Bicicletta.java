package visitor;

public class Bicicletta extends Veicolo {
	
	@Override
	public Double accept(Visitor v) {
		return v.visit(this);
	}
}
