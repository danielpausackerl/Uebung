public class Uebung {

	public static void main(String[] args) {

		// Übung #5 TeilerFinden

		int zahl = 12;
		int teiler = 2;

		String ausgabe = "Teiler von " + zahl + ": ";
		/*
		 * das kann man auch weglassen und dafür das untere System wieder aktiv
		 * setzen - dann aber auch das ausgabe unten inaktiv setzen
		 */

		while (teiler < zahl) {

			// wir wissen, dass ab der Hälfte kein Teiler mehr zu finden ist
			// teiler <= zahl/2

			if (zahl % teiler == 0) {
				// System.out.println(teiler);
				ausgabe += teiler + ", ";
				/*
				 * ohne dem + haben wir nur den letzten Teiler = ausgabe =
				 * ausgabe + teiler + ", ";
				 * 
				 */
			}

			teiler++;

		}

		System.out.println(ausgabe);

	}
}
