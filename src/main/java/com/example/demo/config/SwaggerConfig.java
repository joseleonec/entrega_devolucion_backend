package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.controlador"))
				.paths(PathSelectors.any())
				.build();
	}
    private ApiInfo metaInfo() {

    	ApiInfo apiInfo=new ApiInfo("Susbsistema entrega y devolución", null 
    			, "1.0", "termsOfServiceUrl", "contactName", "license", "licenseUrl");
//        ApiInfo apiInfo = new ApiInfo(
//            "Spring Boot Swagger2 Example API",
//            null,
//            "1.0",
//            "Terms of Service",
//            new Contact("Your Name or Team", null,
//                null),
//            "Apache License Version 2.0",
//            "https://www.apache.org/licenses/"
//        );

        return apiInfo;
    }
   
}
