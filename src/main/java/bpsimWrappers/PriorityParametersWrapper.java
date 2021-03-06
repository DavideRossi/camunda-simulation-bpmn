package bpsimWrappers;

import bpsim.ParameterValue;
import interfaces.IPriorityParametersWrapper;

public class PriorityParametersWrapper extends ParametersWrapper implements IPriorityParametersWrapper {

	private ParameterValue interruptible;
	private ParameterValue priority;

	public PriorityParametersWrapper() {}

	public Boolean getInterruptible() throws Exception {
		return TypeBrain.returnBoolean(interruptible);
	}

	public void setInterruptible(ParameterValue interruptible) {
		this.interruptible = interruptible;
	}

	public Long getPriority() throws Exception {
		return TypeBrain.returnLong(priority);
	}

	public void setPriority(ParameterValue priority) {
		this.priority = priority;
	}

}
