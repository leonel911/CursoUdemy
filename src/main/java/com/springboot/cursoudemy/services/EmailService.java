package com.springboot.cursoudemy.services;

import com.springboot.cursoudemy.domain.Cliente;
import com.springboot.cursoudemy.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    void sendOrderConfirmationEmail(Pedido obj);

    void sendEmail(SimpleMailMessage msg);

    void sendNewPasswordEmail(Cliente cliente, String newPass);
}
