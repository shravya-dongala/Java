package com.lab.practice.StudentDetails;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
@EnableAutoConfiguration
public class Student {
	public static void main(String[] args) 
	{
		SpringApplication.run(Student.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	@Bean
    public Docket produceApi()
    {
    	return new Docket(DocumentationType.SWAGGER_2).select().
    			apis(RequestHandlerSelectors.basePackage("com.lab.practice.StudentDetails")).build(); 
    }

}
