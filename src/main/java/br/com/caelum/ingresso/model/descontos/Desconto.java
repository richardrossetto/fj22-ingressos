package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public interface Desconto {
	
	BigDecimal aplicarDescontosSobre(BigDecimal precoOriginal);
	String getDescricao();

}
