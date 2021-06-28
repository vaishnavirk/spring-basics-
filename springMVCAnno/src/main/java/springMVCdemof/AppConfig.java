package springMVCdemof;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// this is alernative for servletname-servlet.xml files 
@Configuration
@ComponentScan({"springMVCdemof"})
public class AppConfig {

	// internal view resolver is responsible to search for type of extension
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		return vr;
	}
}
