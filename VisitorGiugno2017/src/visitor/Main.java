package visitor;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// CLASSI
		Automobile a = new Automobile();
		Bicicletta b = new Bicicletta();
		
		// OPERAZIONI = VISITOR
		VisitorCosto v_costo = new VisitorCosto();
		VisitorSpeed v_speed = new VisitorSpeed();
		
		System.out.printf("Costo auto: %s\n", a.accept( v_costo ) );
		System.out.printf("Costo bici: %s\n", b.accept( v_costo ) );
		
		System.out.printf("Velocità auto: %s\n", a.accept( v_speed ) );
		System.out.printf("Velocità bici: %s\n", b.accept( v_speed ) );
		
		ArrayList<Veicolo> lista_veicoli = new ArrayList<Veicolo>();
		lista_veicoli.add(a);
		lista_veicoli.add(b);
		lista_veicoli.add(b);
		System.out.printf("Costo totale: %s\n", sommaCosto(lista_veicoli)); 
		
		ArrayList<Automobile> lista_auto = new ArrayList<Automobile>();
		lista_auto.add(a);
		lista_auto.add(a);
	//	System.out.printf("Costo totale: %s\n", sommaCosto(lista_auto) ); 
		
	}
	
	public static <E extends Veicolo> Double sommaCosto(ArrayList<E> lista_veicoli) {
		VisitorCosto v_costo = new VisitorCosto();
		Double somma = 0.0;
		for ( Veicolo ve : lista_veicoli ) {
			somma += ve.accept(v_costo);
		}
		return somma;
	}
	

	public static Double sommaCostoSoloVeicoli(ArrayList<Veicolo> lista_veicoli) {
		VisitorCosto v_costo = new VisitorCosto();
		Double somma = 0.0;
		for ( Veicolo ve : lista_veicoli ) {
			somma += ve.accept(v_costo);
		}
		return somma;
	}
	
}
