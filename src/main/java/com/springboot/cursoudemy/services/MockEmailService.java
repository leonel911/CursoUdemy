package com.springboot.cursoudemy.services;

import com.springboot.cursoudemy.domain.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailService{

    private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    @Override
    public void sendEmail(SimpleMailMessage msg) {
        LOG.info("Simulando envio de email");
        LOG.info(msg.toString());
        LOG.info("Email enviado");

    }

    @Override
    public void sendNewPasswordEmail(Cliente cliente, String newPass) {

    }
}
