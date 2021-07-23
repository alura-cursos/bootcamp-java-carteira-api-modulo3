package br.com.alura.carteira.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@ToString(exclude = {"data", "quantidade", "tipo"})
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transacoes")
public class Transacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ticker;
	private LocalDate data;
	private BigDecimal preco;
	private Integer quantidade;
	
	@Enumerated(EnumType.STRING)
	private TipoTransacao tipo;
	
	@ManyToOne
	private Usuario usuario;

}
