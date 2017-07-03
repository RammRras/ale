package visitor;

public class Automobile extends Veicolo {

	@Override
	public Double accept(Visitor v) {
		return v.visit(this);
	}
	
}
