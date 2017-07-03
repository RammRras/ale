import java.util.ArrayList;

public class Prova {

	public static <E extends Persona > int sommaStipendi( ArrayList<E> lista ) {
		VisitorStipendio v = new VisitorStipendio();
		int somma = 0;
		for (E p : lista) {
			somma = somma + (Integer)p.accept(v);
		}
		return somma;
	}
	
	public static void stampaAttivita( Persona p ) {
		VisitorImpiego vimp = new VisitorImpiego();
		System.out.println( p.accept(vimp) );
	}
	
	public static void main(String[] args) {
		
		ArrayList<Persona> lista =  new ArrayList<>();
		lista.add( new Studente() );
		lista.add( new Lavoratore() );
		lista.add( new Studente() );
		lista.add( new Lavoratore() );
		lista.add( new Studente() );
		lista.add( new Lavoratore() );
		lista.add( new Studente() );
		lista.add( new Lavoratore() );	
		System.out.println( sommaStipendi(lista) );
		
		ArrayList<Studente> listastudente = new ArrayList<>();
		listastudente.add( new Studente() );
		listastudente.add( new Studente() );
		listastudente.add( new Studente() );		
		System.out.println( sommaStipendi(listastudente) );
		
		ArrayList<Lavoratore> listalavoratori = new ArrayList<>();
		listalavoratori.add( new Lavoratore() );
		listalavoratori.add( new Lavoratore() );
		listalavoratori.add( new Lavoratore() );
		listalavoratori.add( new Lavoratore() );
		listalavoratori.add( new Lavoratore() );
		listalavoratori.add( new Lavoratore() );
		System.out.println( sommaStipendi(listalavoratori) );
		
		stampaAttivita( new Studente() );
		stampaAttivita( new Lavoratore() );
		
	}
	
}
