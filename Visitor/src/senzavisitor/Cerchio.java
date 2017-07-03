package senzavisitor;

public class Cerchio extends Figura {

	double raggio;
	
	public Cerchio(double r) {
		this.raggio = r;
	}
	
	@Override
	public double calcolaPerimetro() { return 2*3.14*raggio; }

	@Override
	public double calcolaArea() { return 3.14*raggio*raggio; }

}
