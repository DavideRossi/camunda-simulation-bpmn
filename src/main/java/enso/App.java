package enso;

import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.logging.Logger;


public class App {

	private final static Logger LOGGER = Logger.getLogger("ENSO-APP");

	public static void main( String[] args ) throws FileNotFoundException {
		// init app
		EnsoApp app = new EnsoApp(
			Paths.get("resources","bpmprocesses", System.getProperty("bpmn")),
			System.getProperty("processId"),
			Integer.valueOf(System.getProperty("instancesNumber")),
			Integer.valueOf(System.getProperty("delayBetweenInstances")),
			true
		);
		// start app
		app.startApp();
		// kill app
		System.exit(0);
	}
}
