package org.zeorck.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends 
						AbstractAnnotationConfigDispatcherServletInitializer {

	@Override		// root-context.xml을 대신하는 클래스 지정 == RootConfig.class
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return null;
	}

}
