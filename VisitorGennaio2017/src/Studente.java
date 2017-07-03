
public class Studente extends Persona {

	@Override
	public Object accept(Visitor v) {
		return v.visit( this );
	}

	
	
}
