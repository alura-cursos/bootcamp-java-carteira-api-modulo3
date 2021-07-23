package br.com.alura.carteira.dto;

import java.math.BigDecimal;

import br.com.alura.carteira.modelo.TipoTransacao;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransacaoDto {

	private String ticker;
	private BigDecimal preco;
	private int quantidade;
	private TipoTransacao tipo;

}
