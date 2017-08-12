package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public enum TipoDeIngresso {
		INTEIRO(new SemDesconto()),
		ESTUDANTE(new DescontoEstudante()),
		BANCO(new DescontoTrintaPorCentoParaBancos());
		
		private final Desconto desconto;
		
		 TipoDeIngresso(Desconto desconto){
			this.desconto = desconto;
		}
		
		public BigDecimal aplicaDesconto(BigDecimal valor){
			return desconto.aplicarDescontosSobre(valor);
		}
		
		public String getDescricao(){
			return desconto.getDescricao();
		}
	
}
