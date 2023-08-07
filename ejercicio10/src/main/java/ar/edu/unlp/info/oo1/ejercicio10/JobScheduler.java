package ar.edu.unlp.info.oo1.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
	// es mejor que esta clase sea abtracta, si no quiero usar esta clase como abstracta, hacer una interfaz
	private List<JobDescription> jobs;
	private Strategy estrategia;
	
	
	public JobScheduler() {
		this.jobs = new ArrayList<JobDescription>();
	}
	
	public JobScheduler(Strategy estrategia) {
		this.estrategia = estrategia;
		this.jobs = new ArrayList<JobDescription>();
	}
	
	public void schedule(JobDescription job) {
	    	this.jobs.add(job);
	}
	
    public void unschedule(JobDescription job) {
    	if (job != null) {
    	   this.jobs.remove(job);
    	}
    }
    
    public void setStrategy(Strategy strategy) {
    	this.estrategia = strategy;
    }
    
    public Strategy getEstrategy() {
    	return this.estrategia;
    }
    
    public List<JobDescription> getJobs(){
    	return jobs;
    }
	
    public JobDescription next() {
    	JobDescription nextJob = this.estrategia.next(this.jobs);
    	 this.unschedule(nextJob);
    	 return nextJob;
    }
    
}
