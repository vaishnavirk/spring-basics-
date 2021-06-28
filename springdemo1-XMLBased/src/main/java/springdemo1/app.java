package springdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
//      ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
//      Member member1= (Member)context.getBean("member1");
//      
//      System.out.println(member1.getId());
//      System.out.println(member1.getMemberName());
      
      // SPRING FRAMEWORK TUTORIAL - (This is based on XML based configuration)
      ApplicationContext context = new ClassPathXmlApplicationContext("springtutorial.xml");
      
      // getbean returns obj of vehicle, but vehicle is an interface so we need to mention which class to return when vehicle is called
      // this is mentioned inside our xml file
      
      // this is alternative to -- Vehicle obj = new Car() or new Bike() which causes tight coupling 
      Vehicle obj = (Vehicle)context.getBean("vehicle");  //in xml file we mention vehicle inside id of a bean 
      obj.drive();
      // inside xml, we have mentioned Car inside class path so we will get  Car obj when getBean is called. 
      // advantage of using spring - is we dont have to change java file,  we can get different object by changing xml file, so we dont have to compile our code again
      
     
      

	}

}
