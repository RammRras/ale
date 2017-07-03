package senzavisitor;

public class Rettangolo extends Figura {

	double base, altezza;
	
	public Rettangolo(double b, double h) {
		this.base = b;
		this.altezza = h;
	}
	
	@Override
	public double calcolaPerimetro() { return 2*(base+altezza); }

	@Override
	public double calcolaArea() { return base*altezza; }


}
