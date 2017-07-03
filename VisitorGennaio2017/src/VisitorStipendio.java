
public class VisitorStipendio extends Visitor {

	@Override
	public Integer visit(Studente s) {
		return 0;
	}

	@Override
	public Integer visit(Lavoratore l) {
		return 100;
	}

	
	
}
