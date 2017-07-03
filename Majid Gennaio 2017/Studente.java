
public class Studente implements Persona {

	public int accept(VisitorPersona v) {
		return v.visit(this);
	}

}
