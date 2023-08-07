package ar.edu.unlp.info.oo1.ejercicio14;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

import ar.edu.unlp.info.oo1.interfaz.Lapse;

public class DateLapse implements Lapse{
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.fromTo(from, to);
	}
	
	public DateLapse() {
		this.fromTo(LocalDate.of(1990, 1, 1), LocalDate.of(2010, 1, 1));
	}
	
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	private void fromTo(LocalDate from, LocalDate to) {
		if(from.compareTo(to) > 0) {
			this.from = to;
			this.to = from;		
		}else {
			this.from = from;
			this.to = to;
		}
	}
	
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(this.from, this.to);
	}
	
	public boolean includesDate(LocalDate other) {
		return other.isAfter(this.from) && other.isBefore(this.to);
	}
	
}
