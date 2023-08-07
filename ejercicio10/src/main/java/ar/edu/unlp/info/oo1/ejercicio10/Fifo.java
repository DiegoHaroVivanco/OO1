package ar.edu.unlp.info.oo1.ejercicio10;

import java.util.List;

public class Fifo implements Strategy{
	
	public Fifo() {
		super();
	}
	
	@Override
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = jobs.remove(0);
		return nextJob;
	}
	
}


