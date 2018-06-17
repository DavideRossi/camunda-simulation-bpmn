package util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.camunda.bpm.model.bpmn.Bpmn;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;

import org.w3c.dom.Document;
import bpsimWrappers.ControlParametersWrapper;
import bpsimWrappers.CostParametersWrapper;
import bpsimWrappers.ParametersWrapper;

public class Util {

	protected final static Logger LOGGER = Logger.getLogger("ENSO-APP");
	private static Random random = new Random();

	public static ParametersWrapper retriveParamaterType(String id, Class<?> clsType) {
		// Search all the parameters for a given element
		try {
			ArrayList<Object> bpsimObjects = BpsimCollection.taskObjects.get(id); 
			for (Object currObject : bpsimObjects) {
				if (clsType.isInstance(currObject)) {
					return (ParametersWrapper) currObject;
				}
			}
			throw new Exception();
		} catch (Exception ex) {		
			//LOGGER.info("There are no Bpsim objects defined for this element.");
			return null;					
		}
	}

	public static boolean booleanValueFlow(String elementId) {
		try {
			ControlParametersWrapper controlParameters = (ControlParametersWrapper) retriveParamaterType(elementId, ControlParametersWrapper.class);
			// if there is no object exception with distribution or boolean 
			if (controlParameters == null ) throw new Exception("The Parameters for the out flow:" + elementId + " are not well defined.");
			
			if (controlParameters.getProbability() != null) return random.nextBoolean();
			
			throw new Exception("The Parameters for the out-flow element:" + elementId + " are not well defined.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	return false;
	}
	
	 
	
	public static BpmnModelInstance loadBpmnProcess(Document bpmnDocument) {
		try {
	        // @todo refactor
	        TransformerFactory tf = TransformerFactory.newInstance();
	        Transformer transformer = tf.newTransformer();
	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();              
	        Result outputTarget = new StreamResult(outputStream);
	        transformer.transform(new DOMSource(bpmnDocument),  outputTarget);
	        InputStream is = new ByteArrayInputStream(outputStream.toByteArray());
			
			return Bpmn.readModelFromStream(is);
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	
	
}


