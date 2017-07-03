package visitor;

public class VisitorCalcolaArea extends Visitor {

	@Override
	public String visit(Cerchio c) {
		return "L'area del cerchio è " + (3.14*c.raggio*c.raggio);
	}

	@Override
	public String visit(Rettangolo r) {
		return "L'area del rettangolo è " + (r.base * r.altezza);
	}
	
	
	

}
