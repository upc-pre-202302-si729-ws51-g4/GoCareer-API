package com.edu.pe.gocareerapi.shared.infrastructure.documentation.openapi.configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI goCareerPlatformOpenApi(){
        return new OpenAPI()
                .info(new Info().title("Go Career Platform API")
                        .description("Go Career Platform application REST API documentation")
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0").url("https://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Go Career Platform Wiki Documentation")
                        .url("https://go-career-platoform.wiki.github.org/docs"));
    }
}
