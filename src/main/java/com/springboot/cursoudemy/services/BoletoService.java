package com.springboot.cursoudemy.services;

import com.springboot.cursoudemy.domain.PagamentoComBoleto;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@Service
public class BoletoService implements Serializable {


    public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(instanteDoPedido);
        cal.add(Calendar.DAY_OF_MONTH, 7);
        pagto.setDataVencimento(cal.getTime());



    }
}
