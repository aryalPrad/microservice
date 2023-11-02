package com.vastika.doctorservice.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI myOpenAPI() {
        Contact contact = new Contact();
        contact.setEmail("XYZ@gmail.com");
        contact.setName("XYZ");
        contact.setUrl("https://xyz.com");

        License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Info info = new Info()
                .title("Doctor Service API")
                .version("1.0")
                .contact(contact)
                .description("This API exposes endpoints to Doctor Service.").termsOfService("https://www.bezkoder.com/terms")
                .license(mitLicense);

        return new OpenAPI().info(info);
    }


}