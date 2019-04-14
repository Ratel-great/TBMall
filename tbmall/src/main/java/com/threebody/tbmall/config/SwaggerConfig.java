package com.threebody.tbmall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket front_api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(front_api_info())
                .groupName("TBMall 客户端")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.threebody.tbmall.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket backstage_api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(backstage_api_info())
                .groupName("TBMall 管理系统")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.threebody.tbmall.controller.admin"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 项目信息
     */
    private ApiInfo front_api_info() {
        return new ApiInfoBuilder()
                .title("TBMall 客户端 RESTful APIs")
                .description("API接口列表")
                .version("1.0")
                .build();
    }

    /**
     * 项目信息
     */
    private ApiInfo backstage_api_info() {
        return new ApiInfoBuilder()
                .title("TBMall 客户端 RESTful APIs")
                .description("API接口列表")
                .version("1.0")
                .build();
    }
}