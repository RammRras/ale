
public class VisitorImpiego extends Visitor {

	@Override
	public String visit(Studente s) {
		return "Studia";
	}

	@Override
	public String visit(Lavoratore l) {
		return "Lavora";
	}

	
	
}
