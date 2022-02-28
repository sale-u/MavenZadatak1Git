package it.engineering.main;

import it.engineering.Slanje;
import it.engineering.domain.Student;

public class Main {
	
    public static void main( String[] args ) throws InterruptedException {

    	// pre referenciranja klase Slanje iz modula SlanjePoruka
    	// neophodno je u Aplikacija/pom.xml dodati dependency prema modulu SlanjePoruka
    	Slanje slanje = new Slanje();
    	
    	Student stud1 = new Student("Pera", "pera@gmail.com");
    	Student stud2 = new Student("Mika", "mika@gmail.com");
    	Student stud3 = new Student("Laza", "laza@gmail.com");
    	
    	slanje.posalji(stud1.getEmail(), stud2.getEmail(), "Zdravo Miko. Ovde Pera");
    	Thread.sleep(1000);
    	slanje.posalji(stud2.getEmail(), stud3.getEmail(), "Zdravo Lazo. Ovde Mika");
    	Thread.sleep(1000);
    	slanje.posalji(stud3.getEmail(), stud1.getEmail(), "Zdravo Pero. Ovde Laza");
    	Thread.sleep(1000);
    	slanje.posalji(stud2.getEmail(), stud3.getEmail(), "Zdravo Lazo. Ovde Mika");
    	
    	System.out.println();
    	slanje.listLogs();
    	
    }
}
