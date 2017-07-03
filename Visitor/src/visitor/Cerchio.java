package visitor;

public class Cerchio extends Figura {

	double raggio;
	
	public Cerchio(double r) {
		this.raggio = r;
	}

	@Override
	public String accept(Visitor v) {
		return v.visit( this );
	}
	
	

}
