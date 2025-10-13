package ar.edu.unlp.info.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JobSchedulerTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;

    private void initializeJobs() {

        firstJob = new JobDescription (1, 1, "Este es el primero");
        highestPriorityJob = new JobDescription (1, 100, "Este es el de más prioridad");
        mostEffortJob = new JobDescription (100, 1, "Este es el de más esfuerzo");
        lastJob = new JobDescription (1, 1, "Este es el último");
    }

    @BeforeEach
    void setUp() {
        this.initializeJobs();
    }

    private JobScheduler newFifoScheduler() {
    	JobSelectionStrategy strategy = new FifoStrategy();
        JobScheduler fifoScheduler = new JobScheduler(strategy);
    //    fifoScheduler.setStrategy("FIFO");
        return fifoScheduler;
    }

    private JobScheduler newLifoScheduler() {
    	JobSelectionStrategy lifo = new LifoStrategy();
        JobScheduler lifoScheduler = new JobScheduler(lifo);
      //  lifoScheduler.setStrategy("LIFO");
        return lifoScheduler;
    }

    private JobScheduler newPriorityScheduler() {
    	JobSelectionStrategy highestPriority = new HighestPriorityStrategy();
        JobScheduler priorityScheduler = new JobScheduler(highestPriority);
        //priorityScheduler.setStrategy("HighestPriority");
        return priorityScheduler;
    }

    private JobScheduler newEffortScheduler() {
    	JobSelectionStrategy mostEffort = new MostEffortStrategy();
        JobScheduler effortScheduler = new JobScheduler(mostEffort);
        //effortScheduler.setStrategy("MostEffort");
        return effortScheduler;
    }

    private void scheduleJobsIn(JobScheduler aJobScheduler) {
        aJobScheduler.schedule(firstJob);
        aJobScheduler.schedule(highestPriorityJob);
        aJobScheduler.schedule(mostEffortJob);
        aJobScheduler.schedule(lastJob);
    }

    @Test
    void testSchedule() {
    	JobSelectionStrategy lifo = new LifoStrategy();
        JobScheduler aScheduler = new JobScheduler(lifo);
        aScheduler.schedule(highestPriorityJob);
        assertTrue(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testUnschedule() {
    	JobSelectionStrategy lifo = new LifoStrategy();
        JobScheduler aScheduler = new JobScheduler(lifo);
        this.scheduleJobsIn(aScheduler);
        aScheduler.unschedule(highestPriorityJob);
        assertFalse(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testNext() {
        JobScheduler scheduler;

        scheduler = this.newFifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), firstJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newLifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), lastJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newPriorityScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), highestPriorityJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newEffortScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), mostEffortJob);
        assertEquals(scheduler.getJobs().size(), 3);
    }
}
