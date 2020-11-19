package calcolatrice;

import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
		
		System.out.println("Sono la nuova versione");
		
		  Scanner scanner = new Scanner(System.in);
		  Calcolatrice calcola = new Calcolatrice();
		  System.out.print("Inserisci un numero: ");
		  int numero = scanner.nextInt();
		  System.out.print("Inserisci un operatore: ");
		  char lettera = scanner.next().charAt(0);
		  System.out.print("Inserisci un altro numero: ");
		  int numero2 = scanner.nextInt();
		  if (lettera == '+') {
			  System.out.println("Il risultato è: " + calcola.addizione(numero, numero2));
		  }
		  else if (lettera == '-') {
			  System.out.println("Il risultato è: " + calcola.sottrazione(numero, numero2));
		  }
		  else if (lettera == '/') {
			  System.out.println("Il risultato è: " + calcola.divisione(numero, numero2));
		  }
		  else if (lettera == '*') {
			  System.out.println("Il risultato è: " + calcola.moltiplicazione(numero, numero2));
		  }
		  else {
			  System.out.println("Errore! Operatore non valido. Riprovare");
			  Main.main(args);
		  }
	}

}
