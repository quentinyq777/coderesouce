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
public class SwaggerConfig {

    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
	        .apiInfo(buildApiInf()) // .apiInfo(apiInfo())
	        .select()
	        .apis(RequestHandlerSelectors.basePackage("com.sany"))// 需要生成文档的包的位置
	        .paths(PathSelectors.any())
	        .build();
    }
    
    private ApiInfo buildApiInf() {
	    return new ApiInfoBuilder()
	        .title("三一重工接口信息")
	        .description("Zuul+Swagger2构建RESTful APIs")
	        .termsOfServiceUrl("http://127.0.0.1:8100/")
	        .contact(new Contact("yuqun", "http://127.0.0.1:8100/", ""))
	        .version("1.0")
	        .build();
    }
}