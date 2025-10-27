package oo1.ejercicio19;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return from;
	}

	public LocalDate getTo() {
		return to;
	}

    public int sizeInDays() {
        if (to.isBefore(from)) {
            return 0;
        }
        return (int) ChronoUnit.DAYS.between(this.from, this.to);
    }
    

    public boolean includesDate(LocalDate other) {
        if (to.isBefore(from)) return false; 
        return (other.isEqual(from) || other.isAfter(from)) &&
        	    (other.isEqual(to) || other.isBefore(to));
    }

}