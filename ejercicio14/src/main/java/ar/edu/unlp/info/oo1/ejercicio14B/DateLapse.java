package ar.edu.unlp.info.oo1.ejercicio14B;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import ar.edu.unlp.info.oo1.interfaz.Lapse;


public class DateLapse implements Lapse{
	
	private LocalDate from;
	private int sizeInDayss;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.fromTo(from, to);
	}
	
	public DateLapse() {
		this.fromTo(LocalDate.of(1990, 1, 1), LocalDate.of(2010, 1, 1));
	}
	
	private void fromTo(LocalDate from, LocalDate to) {
		if(from.compareTo(to) > 0) { // por si me envían las fechas al revez, podria no ir y lanzar un error si pasa eso
			this.from = to;
			this.sizeInDayss = (int)ChronoUnit.DAYS.between(to, from);
		}else {
			this.from = from;
			this.sizeInDayss = (int)ChronoUnit.DAYS.between(from, to);
		}
	}


	public LocalDate getFrom() {
		return this.getFrom();
	}


	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDayss);
	}

	public int sizeInDays() {
		return this.sizeInDayss;
	}

	public boolean includesDate(LocalDate other) {
		return other.isAfter(this.from) &&  other.isBefore(this.getTo());
	}
	
}
