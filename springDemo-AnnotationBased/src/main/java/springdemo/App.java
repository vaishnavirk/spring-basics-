package springdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		// here inside we should mention config class name
		// The appConfig class will provide the obj we want
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// inside getBean we mention class name
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();
	}

}
