package masai.Question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		PresentationLayer p = applicationContext.getBean("present", PresentationLayer.class);
		p.printAreaOfCircle(4);
		p.printAreaOfRectangle(5, 7);
		p.printAreaOfSquare(6);
		p.printAreaOfTriangle(6, 4);
	}
}
