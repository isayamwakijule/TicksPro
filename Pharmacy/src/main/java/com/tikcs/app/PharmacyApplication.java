package com.tikcs.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = "com")
@SpringBootApplication
public class PharmacyApplication {/*extends SpringBootServletInitializer{
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(PharmacyApplication.class);
	    }
*/
	public static void main(String[] args) {
		SpringApplication.run(PharmacyApplication.class, args);
	}

}
