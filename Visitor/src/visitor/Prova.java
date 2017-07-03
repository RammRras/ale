package visitor;

import java.util.ArrayList;

public class Prova {

	public static void main(String[] args) {
		
		Cerchio c = new Cerchio(3);
		Rettangolo r = new Rettangolo(2, 4);
		VisitorCalcolaArea varea = new VisitorCalcolaArea();
		VisitorPerimetro vper = new VisitorPerimetro();
		
		System.out.println( "---" );
		System.out.println( c.accept( varea ) );
		System.out.println( r.accept(varea) );
		System.out.println( "---" );

		ArrayList<Figura> listafigure = new ArrayList<>();
		listafigure.add( c );
		listafigure.add( r );
		
		for (Figura fig : listafigure) {
			System.out.println( fig.accept(vper) );
		}
		
		
		/*for (Figura fig : listafigure) {
			
			if ( fig instanceof Cerchio ) {
				Cerchio cc = (Cerchio)fig;
				System.out.println( "Area del cerchio: " + cc.calcolaArea() + " di raggio " + cc.raggio );
			}
			
			if ( fig instanceof Rettangolo ) {
				Rettangolo rr = (Rettangolo)fig;
				System.out.println( "Area del rettangolo: " + fig.calcolaArea() + " di altezza " + rr.altezza );
			}
			
		}*/
		
	}
	
}
