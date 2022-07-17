package com.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ViewResolveConfiguration extends WebMvcConfigurerAdapter{
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver resolve = new InternalResourceViewResolver();
		resolve.setPrefix("/WEB-INF/views/");
		resolve.setSuffix(".jsp");
		registry.viewResolver(resolve);
	}
}
