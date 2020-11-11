package org.hbrs.se.ws20.uebung1.control;

public class GermanTranslator implements Translator {

	public String date = "Okt/2020"; // Default-Wert

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	public String translateNumber( int number ) {
		try {
			String[] translatedNumber = new String[10];
			translatedNumber[0] = "eins";
			translatedNumber[1] = "zwei";
			translatedNumber[2] = "drei";
			translatedNumber[3] = "vier";
			translatedNumber[4] = "fünf";
			translatedNumber[5] = "sechs";
			translatedNumber[6] = "sieben";
			translatedNumber[7] = "acht";
			translatedNumber[8] = "neun";
			translatedNumber[9] = "zehn";
			return translatedNumber[number-1];
		}
		catch(IndexOutOfBoundsException e){
			return("Übersetzung der Zahl " + number + " nicht möglich (" + Translator.version + ")");
		}
	}
		
	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo() {
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: Nov/2020))
	 * Das Datum sollte system-intern gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
