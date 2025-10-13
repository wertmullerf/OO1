package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.Comparator;
import java.util.List;

public class HighestPriorityStrategy implements JobSelectionStrategy{
    public JobDescription next(List<JobDescription> jobs) {
        return jobs.stream()
                   .max(Comparator.comparingDouble(JobDescription::getPriority))
                   .orElse(null);
    }
}
