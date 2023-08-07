package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class DateLapse {
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
	
	public boolean overlaps (DateLapse anotherDateLapse) {
		return (anotherDateLapse.getFrom().isBefore(this.to) ||
				anotherDateLapse.getFrom().isBefore(this.from)); 
	}	
	
	
	public static void main(String[] args) {
		DateLapse p1 = new DateLapse(LocalDate.of(2021, 12, 21),LocalDate.of(2021, 12, 25)); // 21 al 25 de dic
		DateLapse p2 = new DateLapse(LocalDate.of(2021, 12, 28),LocalDate.of(2021, 12, 30)); // 28 al 30 de dic
		DateLapse p3 = new DateLapse(LocalDate.of(2021, 12, 22),LocalDate.of(2021, 12, 26)); // 22 al 26 de dic
		DateLapse p4 = new DateLapse(LocalDate.of(2021, 12, 16),LocalDate.of(2021, 12, 22)); // 16 al 22 de dic
		DateLapse p6 = new DateLapse(LocalDate.of(2021, 12, 24),LocalDate.of(2021, 12, 26)); // 22 al 23 de dic

		System.out.println(p1.overlaps(p2));
		System.out.println(p1.overlaps(p3));
		System.out.println(p1.overlaps(p4));
		System.out.println(p1.overlaps(p6)); 
		
} 

}
