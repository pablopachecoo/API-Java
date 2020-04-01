package br.com.alura.forum.config;

import java.util.List;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {
	@Bean
	public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select()
	        .apis( RequestHandlerSelectors.basePackage( "br.com.alura.forum.controller" ) )
	        .paths(PathSelectors.any())
	        .build();
	}

	

}
