package visitor;

public class Rettangolo extends Figura {

	double base, altezza;
	
	public Rettangolo(double b, double h) {
		this.base = b;
		this.altezza = h;
	}

	@Override
	public String accept(Visitor v) {
		return v.visit( this );
	}
	
	

}
