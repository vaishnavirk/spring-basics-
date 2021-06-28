package springdemo;
import org.springframework.context.annotation.*;


// this class is similar to what we do in XML file in XML based
// to get every obj of every class we mention it as a BEAN and return its obj
@Configuration
@ComponentScan(basePackages="springdemo")
public class AppConfig {
	
	// we annotate this method with @Bean so that we tell that this method is returning Bean obj
	
//	@Bean
//	public Samsung getPhone() {
//		return new Samsung();
//	}
//
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new Snapdragon();
//	}
	
	// we can ignore these above two methods by making the class of Samsung and Snapdragon with @Component and also 
	// annotate AppConfig class with @ComponentScan()
}
