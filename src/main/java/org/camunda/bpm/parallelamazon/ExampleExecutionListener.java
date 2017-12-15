package org.camunda.bpm.parallelamazon;

import java.util.Random;
import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.simulation.EventsQueue;
import org.camunda.bpm.simulation.SimulationEvent;

public class ExampleExecutionListener implements ExecutionListener {
    
	private final static Logger LOGGER = Logger.getLogger("AMAZON-DELIVERY");

	private EventsQueue eventsQueue = new EventsQueue();
	
	public void notify(DelegateExecution execution) throws Exception {
		Random randomGenerator = new Random();
		int randomTime = randomGenerator.nextInt(100);
		LOGGER.info("This task requires " + randomTime + " seconds");
		SimulationEvent simEvnt = new SimulationEvent("", randomTime);
		eventsQueue.add(simEvnt);
	}
}