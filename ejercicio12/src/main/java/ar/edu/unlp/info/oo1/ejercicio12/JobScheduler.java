package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.LinkedList;
import java.util.List;

public class JobScheduler {
	private JobSelectionStrategy strategy;
	private List<JobDescription> jobs;
	
	public JobScheduler( JobSelectionStrategy strategy) {
		this.strategy = strategy;
		this.jobs = new LinkedList<>();
	}
	public void schedule(JobDescription job) {
		jobs.add(job);
	}
	
	public void unschedule(JobDescription job) {
        jobs.remove(job);
	}
	
	public List<JobDescription> getJobs(){
		return jobs;
	}
	
	public JobDescription next() {
		JobDescription nextJob = strategy.next(jobs);
		if(nextJob !=null) {
			this.unschedule(nextJob);
		}
		
		return nextJob;
    }
}
