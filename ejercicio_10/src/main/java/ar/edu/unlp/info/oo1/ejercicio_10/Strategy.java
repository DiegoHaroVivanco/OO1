package ar.edu.unlp.info.oo1.ejercicio_10;

import java.util.List;

public interface Strategy {

	JobDescription next(List<JobDescription> jobs);
	
	
}
