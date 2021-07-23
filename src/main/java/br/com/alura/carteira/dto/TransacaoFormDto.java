package br.com.alura.carteira.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import br.com.alura.carteira.modelo.TipoTransacao;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransacaoFormDto {

	@NotNull
	@NotEmpty
	@Size(min = 5, max = 6)
	private String ticker;

	@NotNull
	@DecimalMin("0.01")
	private BigDecimal preco;

	@PastOrPresent
	private LocalDate data;

	@NotNull
	private int quantidade;

	@NotNull
	private TipoTransacao tipo;

}
