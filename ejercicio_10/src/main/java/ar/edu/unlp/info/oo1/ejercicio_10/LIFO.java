package ar.edu.unlp.info.oo1.ejercicio_10;

import java.util.List;

public class LIFO implements Strategy{

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.get(jobs.size()-1);
	}

	
	
	
}
