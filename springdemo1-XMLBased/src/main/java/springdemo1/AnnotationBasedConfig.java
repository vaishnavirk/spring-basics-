package springdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBasedConfig {
	public static void main(String[] args) {
		// Instead of using XML file to configure our beans we use annotations to do
		// that

		// specify Car class as @component which makes it a bean
		// this is same as creating a bean inside XML
		// we dont have to mention bean id, instead default name for this bean will be
		// class name (we dont have to use package name, and we have to use
		// decapitalised class name, ie car not Car)

		// to let spring know we are using annotation based configuration we have to
		// mention
		// component scan and mention only the package name where components exists

		ApplicationContext context = new ClassPathXmlApplicationContext("springtutorial.xml");

		Car obj = (Car) context.getBean("car"); // here we mention class which is annotatted with @component
		obj.drive();
		
//		// using property tag to set values inside XML, when we are using XMl property tag we use setter 
//		Tyre t = (Tyre)context.getBean("tyre"); // using XML based
//		System.out.println(t.toString());
		
		// constructor injection, here we use constructor to set values instead of setters as earlier using constructor arg tags
//		Tyre t2 = (Tyre)context.getBean("tyre"); // using XML based
//		System.out.println(t2.toString());
		
		
		
		
	}
}
