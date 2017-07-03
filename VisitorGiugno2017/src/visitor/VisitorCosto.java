package visitor;

public class VisitorCosto extends Visitor {

	@Override
	public Double visit(Bicicletta bicicletta) { return 100.0; }

	@Override
	public Double visit(Automobile bicicletta) { return 100000.0; }

}
