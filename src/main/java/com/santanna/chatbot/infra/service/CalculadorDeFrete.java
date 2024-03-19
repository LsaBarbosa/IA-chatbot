package com.santanna.chatbot.infra.service;

import com.santanna.chatbot.domain.dto.DadosCalculoDoFrete;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculadorDeFrete {
public BigDecimal calc(DadosCalculoDoFrete dados){

    return new BigDecimal("3.45").multiply(new BigDecimal(dados.quantidadeDeProdutos()));
}
}
