package it.engineering;

import java.sql.Timestamp;
import java.util.Random;

import it.engineering.report.Izvestaj;

public class Slanje {

	// pre referenciranja klase Izvestaj iz modula IzradaIzvestaja
	// neophodno je u SlanjePoruka/pom.xml dodati dependency prema modulu IzradaIzvestaja
	private Izvestaj izvestaj = new Izvestaj();
	private Random rnd = new Random();

	public boolean posalji(String from, String to, String message) {

		boolean uspesno = rnd.nextBoolean();

		System.out.print("Sa " + from + " saljem poruku ka " + to + " >>> " + message + " >>> ");

		System.out.println((uspesno) ? "USPESNO" : "NEUSPESNO");
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		izvestaj.addLog(timestamp + " >>> " + ((uspesno) ? "USPESNO" : "NEUSPESNO") + " prosledjena poruka od " + from + " ka " + to);

		return uspesno;
	}
	
	public void listLogs() {
		izvestaj.listLogs();
	}

}
