package simulation;

import junit.framework.TestCase;
import testutils.CleanUp;

public class EventsQueueTest extends TestCase{
	
	public void testAddRemove() {
		try {
			EventsQueue eq = new EventsQueue();		
			eq.add(new SimulationTaskEvent("", 0));
			SimulationTaskEvent se = (SimulationTaskEvent) eq.remove();
			
			assertEquals("", se.getName());
			assertEquals(0, se.getTime());			
		} finally {
			CleanUp.resetSimulationClock();
		}
	}	
	
	public void testAddRemoveWithPriority() {
		try {
			EventsQueue eq = new EventsQueue();		
			eq.add(new SimulationStartEvent("test1", 0));
			eq.add(new SimulationStartEvent("test2", 10));
			eq.add(new SimulationStartEvent("test3", 20));
			eq.add(new SimulationTaskEvent("test4", 15));
			eq.add(new SimulationTaskEvent("test5", 22));
			eq.add(new SimulationTaskEvent("test6", 25));
			
			SimulationEvent se = (SimulationEvent) eq.remove();			
			assertEquals("test1", se.getName());
			se = (SimulationEvent) eq.remove();		
			assertEquals("test2", se.getName());
			se = (SimulationEvent) eq.remove();
			assertEquals("test4", se.getName());
			se = (SimulationEvent) eq.remove();
			assertEquals("test3", se.getName());
			se = (SimulationEvent) eq.remove();
			assertEquals("test5", se.getName());
			se = (SimulationEvent) eq.remove();
			assertEquals("test6", se.getName());
		} finally {
			CleanUp.resetSimulationClock();
		}
	}
}
