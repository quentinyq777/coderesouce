package com.sany.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
    	/** 解决 token begin*/
    	ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>(); 
        tokenPar.name("token").description("user token").modelRef(new ModelRef("string")).parameterType("header").required(false).build(); //header中的token参数
    	pars.add(tokenPar.build());  //
    	/** 解决 token end */
    	
        return new Docket(DocumentationType.SWAGGER_2)
	        .apiInfo(buildApiInf()) // .apiInfo(apiInfo())
	        .select()
	        .apis(RequestHandlerSelectors.basePackage("com.sany"))// 需要生成文档的包的位置
	        .paths(PathSelectors.any())
	        .build()
	        .globalOperationParameters(pars);  // 增加token参数
    	
       /* return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sany"))
                .paths(PathSelectors.any())
                .build();*/
    }
    
    

    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder().title("Swagger API")
                .description("UserSwaggerAPI")
                .termsOfServiceUrl("http://localhost:9010/")
                .contact(new Contact("yuq", "http://localhost:9010/", "yuqun777@163.com"))
                .version("1.0")
                .build();
    }

}
