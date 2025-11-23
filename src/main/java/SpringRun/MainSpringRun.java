package SpringRun;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com_spring_design_patterns.singloten.ServiceUnique;

public class MainSpringRun {
	public static void main(String[] args) {

		java.util.logging.Logger log = java.util.logging.Logger.getLogger(MainSpringRun.class.getName());
		System.out.println("Spring version " + org.springframework.core.SpringVersion.getVersion());

		org.springframework.context.ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		com_spring_design_patterns.singloten.ServiceUnique serviceUnique1 = (ServiceUnique) context.getBean(ServiceUnique.class);
		com_spring_design_patterns.singloten.ServiceUnique serviceUnique2 = (ServiceUnique) context.getBean(ServiceUnique.class);

		serviceUnique1.setStatus(3);
		
		System.out.println("Same value  of equals ? : " + serviceUnique1.equals(serviceUnique2));
		System.out.println("Same  reference (==) : " + (serviceUnique1 == serviceUnique2));
		System.out.println(serviceUnique1);
		System.out.println(serviceUnique2);
		
		serviceUnique1.setStatus(2);
		serviceUnique1.displayStatus();

	}
}
