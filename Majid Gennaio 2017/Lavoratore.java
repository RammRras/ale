
public class Lavoratore implements Persona {

	public int accept(VisitorPersona v) {
		return v.visit(this);
	}
}
