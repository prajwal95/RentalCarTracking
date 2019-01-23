package prajwal.rentTrack;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class ApplicationConfig extends AbstractAnnotationConfigDispatcherServletInitializer 
{
    @Nullable
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {Application.class, JPAConfig.class};
	}

    @Nullable
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[0];
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/api/*"};
	}

}
