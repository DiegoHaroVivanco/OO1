package ar.edu.unlp.info.oo1.interfaz;

import java.time.LocalDate;

public interface Lapse {

	LocalDate getFrom();
	
	LocalDate getTo();
		
	int sizeInDays();
	
	boolean includesDate(LocalDate other);	
	
}
