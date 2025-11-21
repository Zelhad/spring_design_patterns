package SpringRun;

public class MainSpringRun {
	public static void main(String[] args) {
		
		java.util.logging.Logger log = java.util.logging.Logger.getLogger(MainSpringRun.class.getName());
		log.info("Spring version " + org.springframework.core.SpringVersion.getVersion());

	}
}
