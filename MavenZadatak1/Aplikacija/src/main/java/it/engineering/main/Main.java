package it.engineering.main;

import java.util.ArrayList;
import java.util.List;

import it.engineering.Slanje;
import it.engineering.domain.Student;
import it.engineering.report.Izvestaj;


public class Main {
	
	private List<Student> students = new ArrayList<>();
	
    public static void main( String[] args ) {
    	
    	Main main = new Main();
  
    	// pre referenciranja klase Izvestaj iz modula IzradaIzvestaja
    	// neophodno je u Aplikacija/pom.xml dodati dependency prema modulu IzradaIzvestaja
    	Izvestaj izvestaj = new Izvestaj();
    	
    	// isto se more uraditi i pre referenciranja Slanje klase iz modula SlanjePoruka
    	Slanje slanje = new Slanje();

    	main.students.add(new Student("Pera", "pera@gmail.com"));
    	main.students.add(new Student("Mika", "mika@gmail.com"));
    	main.students.add(new Student("Laza", "laza@gmail.com"));
    	
    	

    	
    	
    	
    }
}
