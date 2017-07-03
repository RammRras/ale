import java.util.ArrayList;

public class ProvePersona {

	static int sommaStipendi(ArrayList<Persona> A, CalcolaStipendio v) {
		int somma = 0;
		for (Persona persona : A) {
			somma += persona.accept(v);
		}
		return somma;
	}

	static <E extends Persona> int sommaStipendiGen(ArrayList<E> A, CalcolaStipendio v) {
		int somma = 0;
		for (Persona persona : A) {
			somma = somma + persona.accept(v);
		}
		return somma;
	}

	public static void main(String[] args) {

		ArrayList<Persona> A = new ArrayList<Persona>();
		CalcolaStipendio v = new CalcolaStipendio();

		A.add(new Lavoratore());
		A.add(new Lavoratore());
		A.add(new Studente());
		A.add(new Studente());
		A.add(new Lavoratore());
		System.out.println(sommaStipendiGen(A, v));

	}

}
