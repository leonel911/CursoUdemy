package com.springboot.cursoudemy.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.cursoudemy.domain.PagamentoComBoleto;
import com.springboot.cursoudemy.domain.PagamentoComCartao;
import com.springboot.cursoudemy.services.EmailService;
import com.springboot.cursoudemy.services.SmtpEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class JacksonConfig {

// https://stackoverflow.com/questions/41452598/overcome-can-not-construct-instance-of-interfaceclass-without-hinting-the-pare

    @Bean
    public Jackson2ObjectMapperBuilder objectMapperBuilder() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder() {
            public void configure(ObjectMapper objectMapper) {
                objectMapper.registerSubtypes(PagamentoComCartao.class);
                objectMapper.registerSubtypes(PagamentoComBoleto.class);
                super.configure(objectMapper);
            }
        };
        return builder;
    }

    @Bean
    public EmailService emailService() {
        return new SmtpEmailService();
    }
}
