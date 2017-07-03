package visitor;

public class VisitorSpeed extends Visitor {

	@Override
	public Double visit(Bicicletta bicicletta) { return 20.0; }

	@Override
	public Double visit(Automobile bicicletta) { return 100.0; }
	
}
