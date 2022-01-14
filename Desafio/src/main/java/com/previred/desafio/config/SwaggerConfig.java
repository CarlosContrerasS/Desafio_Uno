package com.previred.desafio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.previred.desafio.controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "Servicio Api Rest de Periodos Faltantes Nivel 3",
                "Desafío de Previred: Servico Api Rest que entrega los Periodos Faltantes " +
                        "del Servicio Generador de Periodos o GDD",
                "1.0.0",
                "",
                new Contact("Carlos Contreras Salas", "", "carlos.contreras.salas@gmail.com"),
                "",
                "",
                Collections.emptyList()
        );
    }
}
