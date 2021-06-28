package springMVCdemof;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// this is alternative for web.xml
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// this shows mapping for all 
		return new String[] {"/"};
	}

}
