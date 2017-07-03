
public class CalcolaStipendio implements VisitorPersona {

	@Override
	public int visit(Studente s) {
		return 0;
	}

	@Override
	public int visit(Lavoratore l) {
		return 100;
	}
	
	
}
