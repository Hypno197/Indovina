import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int numeroSegreto = r.nextInt(100) + 1;
		int numeroUtente;
		int tentativi = 1;

		do {
			System.out.println("A che numero sto pensando?");
			numeroUtente = sc.nextInt();
			if (numeroUtente >= numeroSegreto) {
				if (numeroUtente == numeroSegreto) {
					System.out.println("Sei forte! Hai impiegato " + tentativi + "tentativi!");
				} else {
					System.out.println("Prova un numero più basso..");
					tentativi++;
				}
			} else {
				System.out.println("Prova un numero più alto..");
				tentativi++;
			}

		} while (numeroSegreto != numeroUtente);
		sc.close();
	}

}
