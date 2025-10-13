package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.List;

public class FifoStrategy implements JobSelectionStrategy {
	public JobDescription next(List<JobDescription> jobs) {
        return jobs.isEmpty() ? null : jobs.get(0);
	}
}
