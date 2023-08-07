package ar.edu.unlp.info.oo1.ejercicio10;

import java.util.List;

public class Lifo implements Strategy {

	
	public Lifo() {
		super();
	}
	
	@Override
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = jobs.remove(jobs.size()-1);
		return nextJob;
	}

	
}
