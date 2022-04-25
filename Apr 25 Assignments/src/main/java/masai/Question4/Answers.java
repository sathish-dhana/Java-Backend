package masai.Question4;

public class Answers {
	
	//IoC (Inversion of Control) Container//
	
	/* Whenever we use "new" keyword to create object, our class are tightly coupled
	 * so, to decouple and provide modularity we are using IOC containers.
	 * 
	 * IOC container is a normal java class in spring that provides dependencies without need of 
	 * importing or implementing anything in our POJO class.
	 * 
	 * the work of IOC container is to provide dependency of the registered classes.
	 * by providing dependency through IOC container, we have inverted the control from 
	 * the class to create object to the container. 
	 * 
	 *  Using spring IOC container we have achived modularity.
	 * 
	 * */
	
	
	
	//Spring Beans//
	
	/*
	 *	Our POJO classes that are registered with the IOC container 
	 *	are called spring beans.
	 */
	
	
	
	//bean scopes available in Spring//
	// scope availlable are 
	// singleton scope
	// prototype scope
	
	
	//Autowiring and name the different modes of it.What are the limitations of autowiring//
	
	/*
	 * AutoWiring
	 * 
	 * Autowiring is a process of providing association between the POJO classes by using 
	 * IOC container. this increases modularity between the classes and provided inversion of dependency.
	 * 
	 * 
	 * Types of AutoWiring
	 *  
	 *  > Explicit AutoWiring 
	 *  > Implicit AutoWiring
	 * 
	 * 
	 * 
	 * Explicit AutoWiring :
	 * 
	 * The process of providing association between the classes externally using 
	 * xml files hardcoded is called explicit autowiring.
	 * 
	 * 
	 * Implicit AutoWiring :
	 * 
	 * The process of providing association between the classes internally using
	 * annotation is called implicit Autowiring.
	 * 
	 * 
	 * Limitations :
	 * 
	 * > When we have same type of class dependency there may occur ambiguity 
	 * for getting dependency in container.
	 * > Sometimes we need to code implicity to avoid anomaly between objects.
	 * > only objects can be inserted not simple data types
	 */
	
	
	
	
}
