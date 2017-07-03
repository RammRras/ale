package visitor;

public class VisitorPerimetro extends Visitor {

	@Override
	public String visit(Cerchio c) {
		return "Il perimetro del cerchio è " + (3.14*c.raggio*2);
	}

	@Override
	public String visit(Rettangolo r) {
		return "Il perimetro del rettangolo è " + ((r.base + r.altezza)*2);
	}
	
	
	

}
