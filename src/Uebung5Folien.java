
public class Uebung5Folien {

	public static void main(String[] args) {

		// hier wollen wir die Primzahlen finden

		int testZahl = 8;

		if (isPrimeNumber(testZahl)) {
			System.out.println(testZahl + " ist eine Primzahl");
		} else {
			System.out.println(testZahl + " ist keine Primzahl");
		}

	}

	public static boolean isPrimeNumberX(int number) {
		// entweder Variante 1 ohne das X oder Variante 2 mit dem X

		int teiler = 2;

		int gefundeneTeiler = 0;

		while (teiler <= number / 2) {
			if (number % teiler == 0) {
				gefundeneTeiler++;
			}
			teiler++;
		}

		return (gefundeneTeiler == 0);

	}

	public static boolean isPrimeNumber(int number) {
		/*
		 * egal welcher Ausführungspfad es muss immer einen return Wert geben
		 * daher brauchen wir unten das return true, wenn die Schleife fertig
		 * ist und wir nie drinnen waren
		 */

		int teiler = 2;

		while (teiler <= number / 2) {
			if (number % teiler == 0) {
				return false;
				// while Schleife wird durch return immer abgebrochen
			}
			teiler++;
		}

		return true;

	}
}
